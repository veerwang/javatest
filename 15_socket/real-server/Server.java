import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;  

public class Server{
	public static final int PORT = 12345;		//监听的端口号
	public Server () {
		System.out.println("Server Socket Start.... ");
	}

	public void init() {
        	Socket client = null;  
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);    
			while (true) {    
				// 一旦有堵塞, 则表示服务器与客户端获得了连接    
				client = serverSocket.accept();
            			System.out.println("与客户端连接成功！");  
				// 处理这次连接    
				new HandlerThread(client);    
			}
		} catch (Exception e) {
			System.out.println("服务器异常: " + e.getMessage());    
		}
	}

	private class HandlerThread implements Runnable {
		private Socket socket;
		public HandlerThread(Socket client) {
			socket = client;
			new Thread(this).start();
		}

		public void run() {
			try {
				// 读取客户端数据    
				PrintStream out = new PrintStream(socket.getOutputStream());
            			BufferedReader buf = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
            			boolean flag =true;  
				while(flag){  
					//接收从客户端发送过来的数据  
					String str =  buf.readLine();  
					if(str == null || "".equals(str)){
						flag = false;  
					}else{  
						if("bye".equals(str)){  
							flag = false;  
						}else{  
							//将接收到的字符串前面加上echo，发送到对应的客户端  
							out.println("echo:" + str);  
						}
					}
				}

				out.close();    
				socket.close();    
			} catch (Exception e) {
				System.out.println("服务器 run 异常: " + e.getMessage());    
			} finally {    
				if (socket != null) {    
					try {    
						socket.close();    
					} catch (Exception e) {    
						socket = null;    
						System.out.println("服务端 finally 异常:" + e.getMessage());    
					}    
				}
			}
        	}
        }
}

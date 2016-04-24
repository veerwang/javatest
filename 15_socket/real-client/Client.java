import java.io.BufferedReader;  
import java.io.DataInputStream;  
import java.io.PrintStream;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.net.Socket;  
import java.net.SocketTimeoutException;  

public class Client {
	public static final String IP_ADDR = "localhost";	//服务器地址
	public static final int PORT = 12345;		//服务器端口号    
	public Client () {
		System.out.println("客户端启动...");    
		System.out.println("当接收到服务器端字符为 \"OK\" 的时候, 客户端将终止\n");   
	}

	public void Start ()
	{
		while (true) {    
			Socket socket = null;  
			try {  
				//创建一个流套接字并将其连接到指定主机上的指定端口号  
				socket = new Socket(IP_ADDR, PORT);    

				//读取服务器端数据    
        			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  
				//向服务器端发送数据    
        			PrintStream out = new PrintStream(socket.getOutputStream());  
				System.out.print("请输入: \t");    
				BufferedReader buf =  new BufferedReader(new InputStreamReader(socket.getInputStream()));  
				boolean flag = true;  

				while(flag){  
					System.out.print("输入信息：");  
					String str = input.readLine();  
					//发送数据到服务端    
					out.println(str);  
					if("bye".equals(str)){  
						flag = false;  
					}else{  
						try{  
							//从服务器端接收数据有个时间限制（系统自设，也可以自己设置），超过了这个时间，便会抛出该异常  
							String echo = buf.readLine();  
							System.out.println(echo);  
						}catch(SocketTimeoutException e){  
							System.out.println("Time out, No response");  
						}  
					}  
				}  
				input.close();  
				if(socket != null){  
					//如果构造函数建立起了连接，则关闭套接字，如果没有建立起连接，自然不用关闭  
					socket.close(); //只关闭socket，其关联的输入输出流也会被关闭  
				}  
			} catch (Exception e) {  
				System.out.println("客户端异常:" + e.getMessage());   
			} finally {  
				if (socket != null) {  
					try {  
						socket.close();  
					} catch (IOException e) {  
						socket = null;   
						System.out.println("客户端 finally 异常:" + e.getMessage());   
					}  
				}  
			}  
		}
	}
}

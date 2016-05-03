import java.io.*;
import java.io.OutputStreamWriter;
public class FileOperation {
	static String Version = "V1.00";

	public static void Create_File(String filename)
	{
		File file = new File(filename);
		if ( file.exists() ) {
			file.delete();
		}
		else {
			try {
				file.createNewFile();
			} catch ( Exception e ) {
				e.printStackTrace();
			}
		}
	}

	public static void main (String[] argv) {
		System.out.println("System Version: "+Version);
		Create_File("firstboot");
		File file = new File("landi-properties");
		if ( file.exists() )
		{
			file.delete();
			System.out.println("delete file OK");
		}
		else
		{
			try {
				file.createNewFile();
				OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("test"),"GBK");
				String v = new String("time_zone = Asian/Shanghai".getBytes(),"GBK");
				System.out.println(v);
				out.write(v);
				out.flush();
				out.close();
			} catch ( Exception e ) {
				e.printStackTrace();
			}
		}
	}
}

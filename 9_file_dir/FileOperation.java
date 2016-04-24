import java.io.*;
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
				FileOutputStream out = new FileOutputStream(file);
				byte[] buf = "time_zone = Asian/Shanghai".getBytes();
				out.write(buf);
				out.close();
			} catch ( Exception e ) {
				e.printStackTrace();
			}
		}
	}
}

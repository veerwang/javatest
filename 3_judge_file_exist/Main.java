import java.io.File; 
public class Main {
	public static void main (String[] args)
	{
		System.out.println("Hello the world");
		File dir = new File("1");
		if ( dir.exists() )
		{ 
			System.out.println("file exists");
			dir.delete();
		}
		else System.out.println("file no exists");
	}
}

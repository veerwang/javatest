import src.com.Subclass;

public class Main {
	public static void main (String[] args) {
		System.out.println("Hello the world");
		Subclass subclass = new Subclass("kevin");
		subclass.Say();
		subclass.Run();
	}
}

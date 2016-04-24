class Base {
	public Base(String name){
	    System.out.println("Base class created by "+name);
	}
}

public class Main {
	public static void main (String[] args)
	{
		System.out.println("Hello the world");
		Base bs;
		bs = new Base("kevin");
	}

}

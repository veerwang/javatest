package src.com;
public class Base {
	private final String name;
	public Base(String name){
	    System.out.println("The Base class created by "+name);
	    this.name = name;
	}

	public void ScreenOut(){
	    System.out.println("Base class screenout by "+this.name);
	}
}

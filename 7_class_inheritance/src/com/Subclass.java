package src.com;
public class Subclass extends Base implements Interface {
	public Subclass () {
	}
	public Subclass( String name ){
		super.mName = name;
	}
	public void Say() {
		System.out.println("SubClass say by " + mName);
	}
	public void Run() {
		System.out.println("Subclass run by " + mName);
	}
}

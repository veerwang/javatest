public class Main {
	public static void main (String[] args)
	{
		System.out.println("Hello the world");
		
		//int result = new NativeFun.addFunction(10,20);
		NativeFun nativefun = new NativeFun();
		int result = nativefun.addFunction(10,25);
		System.out.println(result);
	}

	static 
	{
		System.loadLibrary("NativeFun");
	}
}

class NativeFun {
	public native int addFunction(int x,int y);
}

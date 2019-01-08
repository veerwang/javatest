public class Main {
	public static void main (String[] args)
	{
		String ver = "1.0.0";
		System.out.println("System Version: "+ver);
		
		//int result = new NativeFun.addFunction(10,20);
		NativeFun nativefun = new NativeFun();
		int result = nativefun.addFunction(10,25);
		System.out.println(result);
		System.out.println(nativefun.makever("kevin"));
	}

	static 
	{
		System.loadLibrary("NativeFun");
	}
}

class NativeFun {
	public native int addFunction(int x,int y);
	public native String makever(String ver);
}

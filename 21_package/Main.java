package src.com;

// 注意这里就不用import命令了
// Main与Base处于一样的命名空间之下
public class Main {
	public static void main (String[] args)
	{
		System.out.println("Hello the world");
		Base bs;
		bs = new Base("kevin");
		bs.ScreenOut();
	}
}

public class Main {
	public static void main (String[] args)
	{
		System.out.println("Test for String Parser");
		String version = "1.00";
		// 将字符串转变成为数字类型
		float  vf = Float.parseFloat(version);
		if ( vf == 1.00 )
			System.out.println("Float OK");

		// 将数字类型转换成为字符串
		int vint = 120;
		String svalue = String.valueOf(vint);
		if ( svalue.equals("120") )
			System.out.println("int OK");

	}
}

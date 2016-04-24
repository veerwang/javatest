// 用于测试final关键字，该关键字相当于const在C++中的含义
public class Main 
{
	static String Code = "My Java Prograrme";
	public static void main ( String[] args )
	{
		final String version = " V1.00";
		System.out.println(Main.Code+version);		// 注意类静态变量的访问方式
	}
}

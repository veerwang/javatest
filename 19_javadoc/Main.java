/**
 * @author  kevin.wang
 * @version V1.1.0
 * @return 返回数值为空
 */

public class Main {
	/**
	 * @param author 输入作者的姓名
	 * @return 目前返回数值都是true 
	 */
	public static boolean Print_Version(String author) {
		System.out.println("Hello the world" + author);
		return true;
	}

	/**
	 *@see Base
	 *@see Base#Base
	 */
	public static void main (String[] args)
	{
		/** 打印的次数 */
		int times = 3; 
		while( times!=0 )
		{
			Print_Version();
			times --;	
		}
	}
}

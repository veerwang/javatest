public class Main {
	public static void main (String[] args)
	{
		System.out.println("Hello the world");
		int x = 20;
		if ( x == 10 ) {
		    System.out.println("equal to 10");
		}
		else if ( x == 20  ) {
		    System.out.println("equal to 20");
		}
		else
		    System.out.println("no equal to 10");

		switch ( x )
		{
			case 10:
		    		System.out.println("switch equal to 10");
				break;

			case 20:
		    		System.out.println("switch equal to 20");
				break;
		}

		while ( x!= 0 )
		{
			x --;
			System.out.println("......");
		}

		for ( int i=0;i<10;i++ )
		{
			System.out.println(">>>>>>");
		}

		int array[] = {6,8,5,3};
		for (int m : array )
		{
			System.out.println("for each value = "+m);
		}
	
		String name[] = new String[]{"kevin","veer","wangwei"};

		int index = 0;
		while ( index < name.length )
			System.out.println("for each value = "+name[index++]);
	}
}

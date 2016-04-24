import java.util.*;
public class Main {
	public static void main (String[] args)
	{
		System.out.println("Programe List Test");
		String a = "kevin";
		String b = "veer";
		String c = "wangwei";
		List<String> mylist = new LinkedList<String>();
		mylist.add(a);
		mylist.add(b);
		mylist.add(c);

		mylist.set(2,"weiwang");

		for ( int i=0;i<3;i++  )
		{
			System.out.println("value " + mylist.get(i));
		}

		Iterator<String> it = mylist.iterator();

		while(it.hasNext())
		{
			System.out.println("value: " + it.next());
		}
	}
}

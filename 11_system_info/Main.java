public class Main {
	public static void main (String[] args)
	{
		System.out.println("System info reading...");
		Runtime rt = Runtime.getRuntime();
		System.out.println("System total memory :"+rt.totalMemory() );
		System.out.println("System: free memory :"+rt.freeMemory() );
	}
}

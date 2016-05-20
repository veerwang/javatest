public class Main {

	public static class NoSupportException extends Exception {
		public NoSupportException(){
		}

		public NoSupportException(String message){
			super(message);
		}

		public NoSupportException(Throwable cause){
			super(cause);
		}

		public NoSupportException(String message,Throwable cause){
			super(message,cause);
		}
	}

	public static void Sout() throws NoSupportException {
		throw new NoSupportException("just test the function");
	}

	public static void main (String[] args)
	{
		try {
			System.out.println("Hello the world");
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}

		try {
			Sout();
		}
		catch (NoSupportException e) {
			e.printStackTrace();
		}
	}
}

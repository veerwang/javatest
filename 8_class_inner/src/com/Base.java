package src.com;
public class Base {
	private int x;
	public Base(int x){
		this.x = x;
	}

	public class Innerclass {
		private int x;
		public Innerclass(int x) {
			this.x = x;
		}

		public void Say() {
			System.out.println("Innerclass x = " + Base.this.x);
		}
	}

	public void Say()
	{
		Innerclass ic = new Innerclass( this.x + 5 );
		ic.Say();
	}
}

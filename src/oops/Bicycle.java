package oops;

	public class Bicycle extends test2{
		
		public static void main(String[] args) {
			System.out.println("This is main");
			Bicycle by=new Bicycle();
			by.overridemethod();
		}
		
		public void overridemethod(){
			System.out.println("This is chile bicycle whch is overridded");
		}
	}

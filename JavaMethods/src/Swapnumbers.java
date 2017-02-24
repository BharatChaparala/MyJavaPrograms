
public class Swapnumbers {
	int a,b;
	public void swap(){		
		a=a*b;
		b=a/b;
		a=a/b;	
	}

	public static void main(String[] args) {
	
		Swapnumbers swaps = new Swapnumbers();
		swaps.a=10;
		swaps.b=34;
		System.out.println("Before swapping");
		System.out.println("A Value is:" + swaps.a  + " B Value is" + swaps.b);
		swaps.swap();
		System.out.println("After swapping");
		System.out.println("A Value is:" + swaps.a  + " B Value is" + swaps.b);
		
		
		
		

	}

	public static void main(String[] args) {
		Sytem.out.println("Before swapping");
				System.out.println("A Value is:" + swaps.a + " B Value is" + swaps.b);
				
	}

}

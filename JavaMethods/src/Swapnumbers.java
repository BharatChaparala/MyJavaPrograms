
public class Swapnumbers {
	int a=20,b=30;
	public void swap(){		
		a=a*b; //10+6=16
		b=a/b; //16-6=10
		a=a/b;	//16-10=6
	}

	public static void main(String[] args) {
	
		Swapnumbers swaps = new Swapnumbers();
		System.out.println("Before swapping");
		System.out.println("A Value is:" + swaps.a  + " B Value is" + swaps.b);
		swaps.swap();
		System.out.println("After swapping");
		System.out.println("A Value is:" + swaps.a  + " B Value is" + swaps.b);

	}

	}

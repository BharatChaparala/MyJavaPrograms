
public class Fibonnaci {

	
	public static void main(String[] args) {
		
		
			 int n1=0,n2=1,n3=0,i,fibnumber=25;    
			 System.out.print(n1+" "+n2);//printing 0 and 1    
			    
			 
			 //for(i=2;i<fibnumber;++i)//loop starts from 2 because 0 and 1 are already printed    
			 do
			 {
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;  	
			 }
			 while(fibnumber>(n1+n2));
		
		
	}

}

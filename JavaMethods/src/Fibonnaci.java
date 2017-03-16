
public class Fibonnaci {

	
	public static void main(String[] args) {
		
		
			 //int n1=0,n2=1,n3=0,fibnumber=25;    
			 //System.out.print(n1+" "+n2);//printing 0 and 1    
			   
		int i=0,j=1,fibnumber=0;

				for(i=0;i<25;i++)
				{
				j=i;
				i=fibnumber;
				
				System.out.print(" " +fibnumber);
				fibnumber=i+j;
				}
			 
			/* do
			 {
			  n3=n1+n2;   //n3=1,1
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;  	
			 }
			 while(fibnumber>(n1+n2));*/
		
		
	}

}

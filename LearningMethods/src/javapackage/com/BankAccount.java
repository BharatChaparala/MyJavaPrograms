package javapackage.com;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		
		
		int bal = 1000;
		int ch;
		int amount =0;
		//do
		//{
		System.out.println("Menu");
		System.out.println("1:Check Balance");
		System.out.println("2:Withdraw Amount");
		System.out.println("3:Deposit Amount");
		System.out.println("4:Exit");
		System.out.println("Please enter your choice");
		//Scanner sc =new Scanner(System.in);
		//ch = sc.nextInt();
		ch = Integer.parseInt(args[0]);
		amount = Integer.parseInt(args[1]);
		if(ch==2 || ch == 3)
		{ 
			//System.out.println("Enter amount");
			//amount = sc.nextInt();
		}
//		sc.close();
		switch(ch)
		{
		case 1:	
			System.out.println("Balance is " +bal);
			break;
		case 2:	
			if(amount > bal)
				System.out.println("No sufficient balance");
			else
			{
				bal-=amount;
				System.out.println("Balance is " +bal);
			}
			break;
		case 3:
			bal+=amount;
			System.out.println("Balance is " + bal);
			break;
		case 4:
			
			System.out.println("Exited");
			break;
		default:
			
			System.out.println("Wrong choice");
			break;
		}
		//} while(ch !=4 );
	}

}

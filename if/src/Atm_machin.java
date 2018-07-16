import java.util.Scanner;
public class Atm_machin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int owner;
	float transaction = 0;
	float balance= 500;
	System.out.println("ATM");
	System.out.println("\nDeposite funds=1");
	System.out.println("\nWithdrawl funds=2");
	System.out.println("\nEnter your selection");
	Scanner input=new Scanner(System.in);
	owner=input.nextInt();
		
	if (owner==1){
		System.out.println("Enter your Deposite funds:");
		Scanner input1=new Scanner(System.in);
		transaction=input1.nextInt();
		
		
	}
	 if(owner==2) {
		System.out.println("Enter your Withdrawl funds");
		Scanner input2=new Scanner(System.in);
		transaction=input2.nextInt();
	}
	 if(transaction>balance)
	{
		System.out.println("Insufficiant balance");
	
		}
	 if(owner==2){
	 System.out.printf("Your new balance is $ %f",balance-transaction);
	}
	 if(owner==1) {
		 System.out.printf("Your new balance is$ %d",balance+transaction);
	 }
	}

}
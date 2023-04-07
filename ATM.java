import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000;

        System.out.println("Welcome to the ATM!");

        while (true) {
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
	    System.out.println("4. Transfer");
            System.out.println("5. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
		    System.out.println("last transaction is on dd/mm/yyyy");
                    System.out.println("Your balance is $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int amountToWithdraw = scanner.nextInt();

                    if (amountToWithdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= amountToWithdraw;
                        System.out.println("Please collect your cash.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    int amountToDeposit = scanner.nextInt();
                    balance += amountToDeposit;
                    System.out.println("$" + amountToDeposit + " has been deposited into your account.");
                    break;
			  case 4:
				  System.out.println("Enter the account number which you are willing to transfer");
				  long bnum= scanner.nextLong();
				  System.out.println("Enter the required amount ");
				  int amount = scanner.nextInt();
			       balance = balance-amount;
				  System.out.println("Amount is transferred Succesfully");
				  System.out.println("Your current balance is "+balance);
				  break;
                case 5:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}

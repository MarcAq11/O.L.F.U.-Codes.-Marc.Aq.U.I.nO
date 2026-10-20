import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome!");
        System.out.print("Enter your balance: ");
        int balance = scanner.nextInt();
        scanner.nextLine(); 

         while (true) {
            System.out.println("--------------------------------------");
            System.out.println("Select an option:");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Exit");
            System.out.println("--------------------------------------");
            
            System.out.print(" ");
            String choice = scanner.nextLine();
            System.out.println("--------------------------------------");
            
            if (choice.equals("1")) {
                System.out.println("How much amount you want to withdraw from your account?");
                System.out.print("Amount: ");
                int withdrawAmount = scanner.nextInt();
                scanner.nextLine(); 
                
                if (withdrawAmount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Your new balance is: " + balance);
                }
                
            } else if (choice.equals("2")) {
                System.out.println("How much amount you want to deposit in your account?");
                System.out.print("Amount: ");
                int depositAmount = scanner.nextInt();
                scanner.nextLine(); 
                
                balance += depositAmount;
                System.out.println("Your new balance is: " + balance);
                
            } else if (choice.equals("3")) {
                System.out.println("Thank you for using the system!");
                break; 
                
            } else {
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
            }
        }
        
        scanner.close();
    }
}

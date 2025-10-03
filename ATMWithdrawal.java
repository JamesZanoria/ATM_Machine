import java.util.Scanner;

public class ATMWithdrawal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;
        int withdrawalAmount = 0;
        boolean isValidWithdrawal = false;

        try{
            System.out.print("Enter your current balance: ");
            balance = Integer.parseInt(input.nextLine());

            if(balance < 0){
                System.out.println("Error: Balance cannot be negative. Exiting program.");
                input.close();
                return;
            }
        } catch (NumberFormatException e){
            System.out.println("Error: Invalid number format. Exiting program.");
            input.close();
            return;
        }
            
        do{
            try{
                System.out.print("Enter withdrawal amount: ");
                withdrawalAmount = Integer.parseInt(input.nextLine());
                
                if(withdrawalAmount > balance){
                    System.out.println("Error: Insufficient funds.");
                    System.out.println();
                } else if(withdrawalAmount < 0){
                    System.out.println("Error: Withdrawal amount must be positive.");
                    System.out.println();
                } else {
                    isValidWithdrawal = true;
                }
            } catch (NumberFormatException e){
                System.out.println("Error: Invalid number format.");
                System.out.println();
            }
        } while(!isValidWithdrawal);

        balance -= withdrawalAmount;
        System.out.println("Withdrawal successful. New balance: " + balance);

        System.out.println("Thank you for using our ATM service.");
        input.close();
    }
}
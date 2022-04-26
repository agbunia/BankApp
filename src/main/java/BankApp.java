import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account account = new Account();

        account.createAccount();
        System.out.println("Hello in our bank!");
        System.out.println("1. Display account details");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("Enter your choice");

        int choice;
        choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                account.showAccount();
            }
            case 2: {
                account.depositMoney();
            }
            case 3: {
                account.withdrawal();
            }

        }
    }
}

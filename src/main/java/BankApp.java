import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello in our bank!");
        System.out.println("How many users do you want to add?");
        int amountNewUsers = scanner.nextInt();
        Account tableNewCustomers[] = new Account[amountNewUsers];
        for (int i = 0; i < tableNewCustomers.length; i++){
            tableNewCustomers[i] = new Account();
            tableNewCustomers[i].createAccount();
            tableNewCustomers[i].showAccount();
        }

        int choice;

        do {
            System.out.println("1. Display all accounts");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit app");
            System.out.println("Enter your choice");

            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
//                    account.showAccount();
                    break;
                }
                case 2: {
                    System.out.println("Enter account number to deposit: ");
                    String accountNumber = scanner.next();
                    boolean found = false;
                    for(int i = 0; i < tableNewCustomers.length; i++){
                        found = tableNewCustomers[i].search(accountNumber);
                        if(found){
                            tableNewCustomers[i].depositMoney();
                        }
                    }
//                    account.depositMoney();
                    break;
                }
                case 3: {
//                    account.withdrawal();
                    break;
                }
                case 4: {
                    System.out.println("Bye bye");
                    break;
                }

            }

        }
        while(choice != 4);

    }
}

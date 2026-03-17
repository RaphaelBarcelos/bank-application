import java.util.Scanner;

public class Main {    

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 10;
        int accountNumber = 0;
        Account[] accounts = new Account[length];
        int choice;

        while (true) {
            System.out.println("---Bank System---");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            while (true) {
                System.out.print("Enter your choice: ");
                try{
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
                
            }
            
            switch (choice) {
                case 1:
                System.out.println("---Account Creation---");
                System.out.print("Type your username: ");
                String username = scanner.nextLine();
                System.out.print("Type your password: ");
                String password = scanner.nextLine();

                

                for(int i = 0; i < accounts.length; i++) {
                    if(accounts[i] == null) {
                        accounts[i] = new Account(username, password);
                        accountNumber = i;
                        break;
                    }
                }

                System.out.println("Account created successfully! Your balance is: " + accounts[accountNumber].getBalance());
                System.out.println("----------------------");                    
                break;
                case 2:
                    System.out.println("---Login---");
                    System.out.print("Type your username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Type your password: ");
                    String loginPassword = scanner.nextLine();

                    int foundAccount = -1;

                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] != null && loginUsername.equals(accounts[i].getUsername()) && loginPassword.equals(accounts[i].getPassword())) {
                            foundAccount = i;
                            break;
                        }
                    }
                    if(foundAccount != -1) {
                        accountNumber = foundAccount;
                        
                        boolean login = true;
                        while (login) {
                            System.out.println("---Account Menu---");
                            System.out.println("Balance: " + accounts[accountNumber].getBalance());
                            System.out.println("1. Add Balance");
                            System.out.println("2. Withdraw Balance");
                            System.out.println("3. Transaction History");
                            System.out.println("4. Logout");

                            System.out.print("Enter your choice: ");
                            choice = Integer.parseInt(scanner.nextLine());

                            switch (choice) {
                                case 1:
                                    System.out.print("Enter amount to add: ");
                                    double addAmount = Double.parseDouble(scanner.nextLine());
                                    accounts[accountNumber].addBalance(addAmount);
                                    System.out.println("Balance updated! Your new balance is: " + accounts[accountNumber].getBalance());
                                    break;
                                case 2:
                                    System.out.print("Enter amount to withdraw: ");
                                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                                    accounts[accountNumber].withdrawBalance(withdrawAmount);
                                    System.out.println("Balance updated! Your new balance is: " + accounts[accountNumber].getBalance());
                                    break;
                                case 3:
                                    System.out.println("---Transaction History---");
                                    accounts[accountNumber].addTransaction("Sorveteria", 15);
                                    accounts[accountNumber].addTransaction("Mercado", 600);
                                    accounts[accountNumber].printTransactionHistory();
                                    System.out.println("---------------------------");
                                    break;
                                case 4:
                                    login = false;
                                    break;
                                default:
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Invalid username or password.");
                        break;
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
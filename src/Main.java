import java.util.Scanner;

public class Main {    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 10;
        int accountNumber = 0;
        Account[] accounts = new Account[length];
        int choice;
        // Main loop for the bank system
        while (true) {
            System.out.println("---Bank System---");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            // Input validation for menu choice
            while (true) {
                System.out.print("Enter your choice: ");
                try{
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
                
            }
            // Switch case for menu options
            switch (choice) {
                case 1:
                // Account creation process: ask for username and password, create a new account and add it to the accounts array
                System.out.println("---Account Creation---");
                System.out.print("Type your username: ");
                String username = scanner.nextLine();
                System.out.print("Type your password: ");
                String password = scanner.nextLine();

                
                // Create a new account and add it to the accounts array
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
                    // Login process: ask for username and password, check if they match any account in the accounts array
                    System.out.println("---Login---");
                    System.out.print("Type your username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Type your password: ");
                    String loginPassword = scanner.nextLine();
                    // Check if the username and password match any account in the accounts array
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
                        // Account menu loop: after successful login, show the account menu with options to add balance, withdraw balance, view transaction history, and logout
                        while (login) {
                            System.out.println("---Account Menu---");
                            System.out.println("Balance: " + accounts[accountNumber].getBalance());
                            System.out.println("1. Add Balance");
                            System.out.println("2. Withdraw Balance");
                            System.out.println("3. Transaction History");
                            System.out.println("4. Logout");

                            // Input validation for account menu choice
                            while (true) {
                                System.out.print("Enter your choice: ");
                                try{
                                    choice = Integer.parseInt(scanner.nextLine());
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Invalid input. Please enter a number.");
                                }
                
                            }
                            // Switch case for account menu options
                            switch (choice) {
                                // Add balance process: ask for the amount to add, call the addBalance method of the Account class, and update the balance
                                case 1:
                                    System.out.print("Enter amount to add: ");
                                    double addAmount = Double.parseDouble(scanner.nextLine());
                                    accounts[accountNumber].addBalance(addAmount);
                                    System.out.println("Balance updated! Your new balance is: " + accounts[accountNumber].getBalance());
                                    break;
                                // Withdraw balance process: ask for the amount to withdraw, call the withdrawBalance method of the Account class, and update the balance
                                case 2:
                                    System.out.print("Enter amount to withdraw: ");
                                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                                    accounts[accountNumber].withdrawBalance(withdrawAmount);
                                    System.out.println("Balance updated! Your new balance is: " + accounts[accountNumber].getBalance());
                                    break;
                                // Transaction history process: call the printTransactionHistory method of the Account class to display the transaction history
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
                // Exit process: exit the program
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
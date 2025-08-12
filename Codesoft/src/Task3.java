// ATM program
// By : Surbhi Sharma


import java.util.Scanner;
// Represent a simple bank account with deposit and withdrawal features
//BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

class ATM{
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account){
        this.account= account;
        this.sc = new Scanner(System.in);
    }
    public void start(){
        int choice;
        System.out.println("Welcome to ATM");
        do{
            System.out.println("ATM MENU");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print(" choose an option =  ");
             choice = sc.nextInt();

             switch(choice){
                 case 1 -> withdrawal();
                 case 2 -> depositMoney();
                 case 3 -> showBalance();
                 case 4 -> System.out.println("Thank you for using ATM");
                 default -> System.out.println("Invalid choice!");

             }
        }while(choice!=4);
    }

    private void withdrawal(){
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if(amount<=0){
            System.out.println("invalid amount! Please enter a positive value");
        }
        else if(account.withdraw(amount)){
            System.out.println("withdrawal successful!");
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    private void depositMoney(){
        System.out.println("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if(amount>0){
            account.deposit(amount);
            System.out.println("Deposit Successful!");
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    private void showBalance(){
        System.out.println("Your current balance is " + account.getBalance());

        }
    }

    //Main class to run the program
public class Task3{
    public static void main(String[] args){
        BankAccount userAccount = new BankAccount(3000.0); // initial balance 3000Rs.
        ATM atmMachine = new ATM(userAccount);
        atmMachine.start();

        }


}
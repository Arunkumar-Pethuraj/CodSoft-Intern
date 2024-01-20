package org.atminterface;

import java.util.Scanner;

class BankAccount{
	
	private int balance;

    public BankAccount(int initialAmount){
        this.balance = initialAmount;
    }

    public int balance(){
        return balance;
    }

    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Rs." +amount+ " Deposit Successfully");
        } else {
            System.out.println("Invalid entry!, Please choose a number above 0");
        }
    }

    public void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            System.out.println("Rs." +amount+ " Withdraw Successfully");
            balance -= amount;
        } else {
            System.out.println("Invalid entry!, Insuffucient balance or negative value entered");
        }
    }
}

class ATM{

    private BankAccount account; 
  
      public ATM(BankAccount account){
        this.account = account;
    }

    public void display(){
        System.out.println("\nSelect Options");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Leave");
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            display();
            System.out.println("Pick an option");
            option = sc.nextInt();
            
            switch (option){
                case 1:
                    System.out.println("Enter a deposit amount : ");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter a withdraw amount : ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance : " + account.balance());
                    break;
                case 4:
                    System.out.println("Thanks for working with Arun Bank");
                    break;
                default:
                    System.out.println("Invalid entry!, Enter only the given options");   
            }
        }while (option != 4);
        sc.close();
    }
}

public class AtmInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(30000);
        ATM atm = new ATM(userAccount);
        System.out.println("Enter Your PIN");
        int pin = sc.nextInt();
        if (pin == 1234) {
            atm.run();
        } else {
            System.out.println("Wrong pin");
        }
        sc.close();
    }
}
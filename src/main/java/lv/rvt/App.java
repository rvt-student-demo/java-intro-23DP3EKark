package lv.rvt;
// import java.util.Random;
// import java.util.ArrayList;
// import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        Account mathewsAccount = new Account("Mathews account", 1000.00);
        Account myAccount = new Account("my account", 0.00);
        
        mathewsAccount.withdraw(100);
        System.out.println("The balance of Mathews account is now: " + mathewsAccount.balance());
        myAccount.deposit(100);
        System.out.println("The balance of my account is now: " + myAccount.balance());
        
        System.out.println("End state");
        System.out.println(mathewsAccount);
        System.out.println(myAccount);

    }
}
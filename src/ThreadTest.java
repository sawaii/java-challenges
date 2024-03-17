import java.util.Scanner;

class Account{
    int balance;
    Account(int bal){
        balance = bal;
    }

    boolean balanceCheck(int amount){
        if (balance >= amount)
            return true;
        else {
            System.out.println("Insufficient balance..!");
            return false;
        }
    }

    void withdraw(int amount, String customer){
        if(balanceCheck(amount)) {
            balance = balance - amount;
            System.out.println("Transaction successful for: "+ customer + " and your remaining balance is: "+ balance);
        }
    }
}

class Customer implements Runnable{
    String customer;
    Account account;

    Customer(Account account, String customer){
        this.account = account;
        this.customer = customer;
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        synchronized (account){
            System.out.println("Enter amount to withdraw for "+customer+" : ");
            int amount = scanner.nextInt();
            account.withdraw(amount,customer);
        }
    }
}

public class ThreadTest{
    public static void main(String[] args) {
        Account account = new Account(10000);
        Customer customer1 = new Customer(account, "Rock");
        Customer customer2 = new Customer(account, "shock");
        Thread thread1 = new Thread(customer1);
        Thread thread2 = new Thread(customer2);
        thread1.start();
        thread2.start();
    }
}

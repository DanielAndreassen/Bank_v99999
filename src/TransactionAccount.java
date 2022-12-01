import java.util.ArrayList;
import java.util.Scanner;

public class TransactionAccount extends Account {
    //att
    TransactionAccount newTranAcc;

    String latestTransacc = "noDate";

    ArrayList<String> transactions = new ArrayList<String>();

    ArrayList<TransactionAccount> TransAccs = new ArrayList<>();

    //const
    public TransactionAccount() {
    }

    public TransactionAccount(int accNumber, float balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    //meth
    public void create() { // make new Transaction account
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.println("Enter the account number for the account");
            int a = myScanner.nextInt();
            System.out.println("Enter the starting balance");
            float b = myScanner.nextFloat();
            this.newTranAcc = new TransactionAccount(a, b);
            TransAccs.add(newTranAcc);
            Bank bank = new Bank();
            bank.start();

        } catch (Exception e) {
            System.out.println("Error invalid datatype try again!");
        }
    }

    public void change() { //Change balance of specific account
        int i = 1;
        for (TransactionAccount Tranacc : TransAccs) {
            System.out.println(i + Tranacc.getAccnumber());
            i++;
        }
        System.out.println("Enter the account number you want to change");
        try {
            Scanner myScanner = new Scanner(System.in);
            int answer = myScanner.nextInt();
            for (TransactionAccount Transacc : TransAccs) {
                if (Transacc.getAccnumber() == answer) {
                    System.out.println("What do you want to change the balance to?");
                    float a = myScanner.nextFloat();
                    this.setBalance(a);
                    Bank bank = new Bank();
                    bank.start();

                } else {
                    System.out.println("The account you are looking for does not exsist");
                    change();
                }
            }
        } catch (Exception e) {
            System.out.println("Data error detected, try AGAIN!");
        }
    }

    //getsett

    public int getAccnumber() {
        return accNumber;
    }

}

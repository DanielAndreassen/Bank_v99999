import java.util.ArrayList;
import java.util.Scanner;

public class SavingAccount extends Account {
    //att
    SavingAccount newSavAcc;

    double interest = 0.00;

    ArrayList<SavingAccount> SavAccs = new ArrayList<>();

    //const
    public SavingAccount(int accNumber, float balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public SavingAccount() {
    }

    //meth
    public void create() { // make new Saving account
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.println("Enter the account number for the account");
            int a = myScanner.nextInt();
            System.out.println("Enter the starting balance");
            float b = myScanner.nextFloat();
            this.newSavAcc = new SavingAccount(a, b);
            SavAccs.add(newSavAcc);
            Bank bank = new Bank();
            bank.start();

        } catch (Exception e) {
            System.out.println("Error invalid datatype try again!");
        }
    }

    public void change() { //change balance

    }
    //getsett


}

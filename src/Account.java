import java.util.Scanner;

public class Account {
    //att
    User user;
    //test
    float balance = 00000;
    int accNumber = 000000000;

    Account type;

    //const
    public Account() {
    }

    public Account(int accNumber) {
        this.accNumber = accNumber;
    }
    //meth

    public void create() { //Create new Account
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.println("What type of account is it?");
            System.out.println("Enter 1 for a Savings account");
            System.out.println("Enter 2 for a Transaction account");
            int a = myScanner.nextInt();
            if (a == 1) {
                SavingAccount sav = new SavingAccount();
                sav.create();
            }
            if (a == 2) {
                TransactionAccount tra = new TransactionAccount();
                tra.create();
            }

        } catch (Exception e) {
            System.out.println("Error invalid datatype try again!");
        }
    }

    //getsett

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}

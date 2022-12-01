import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
    //att
    //Bank bank = new Bank();
    User userClass = new User();
    Account accountClass = new Account();


    //const
    public Bank() {
    }

    //meth
    public void start() {//main start of bank
        System.out.println("Welcome to da Bank");
        System.out.println("What would you like to do?");
        System.out.println("Enter 1 to Create a new User or a new account");
        System.out.println("Enter 2 if you would like to link a User with an account");
        System.out.println("Enter 3 to change the balance of an account");
        System.out.println("Enter 4 to see the total amount of Users");
        System.out.println("Enter 5 to se the total amount of mungri in da bank");
        Scanner scanner = new Scanner(System.in);
        int ans = scanner.nextInt();
        Bank bank = new Bank();
        switch (ans) {
            case 1:
                System.out.println("Would you like to make an account or a new User?");
                System.out.println("Enter 1 for user");
                System.out.println("Enter 2 for account");
                int ans1 = scanner.nextInt();
                switch (ans1) {
                    case 1:
                        bank.createUser();
                        break;
                    case 2:
                        bank.createAcc();
                        break;
                }
                break;
            case 2:
                bank.link();
                break;
            case 3:
                bank.changeBal();
                break;
            case 4:
                bank.showUsers();
                break;
            case 5:
                bank.showTotalDollar();
                break;
        }
    }

    public void createUser() { //make a new user
        userClass.create();
    }

    public void createAcc() { //make a new account
        accountClass.create();

    }

    public void link() { //link an account with a user
    }

    public void changeBal() { //change the balance of an account
        try {
            System.out.println("do you want to change the balance of a savings account or a transaction account?");
            System.out.println("Enter 1 for saving accounts");
            System.out.println("Enter 2 for Transaction accounts");
            Scanner myscanner = new Scanner(System.in);
            int a = myscanner.nextInt();
            if (a == 1) {
                SavingAccount sav = new SavingAccount();
                sav.change();

            }
            if (a == 2) {
                TransactionAccount tra = new TransactionAccount();
                tra.change();
            }
            if (a > 3) {
                System.out.println("Enter one of the options please.");
            }
        } catch (Exception e) {
            System.out.println("Invalid datatype try again!");

        }
    }

    public void showUsers() { //all shows all users
        userClass.showAll();
    }

    public void showTotalDollar() { // show total amount of wealth in the bank

    }


    //getsett
}

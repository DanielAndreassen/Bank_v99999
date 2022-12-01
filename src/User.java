import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

public class User {
    //att
    User newUser;
    String name = "noName";
    int perNumber = 0000000000;

    Account account;
    ArrayList<User> Users = new ArrayList<>();

    //const
    public User() {
    }

    public User(String name, int perNumber) {
        this.name = name;
        this.perNumber = perNumber;

    }

    //meth


    public void create() {  //MAKE NEW USER
        try {
            System.out.println("What is the name of your user?");
            Scanner scanner = new Scanner(System.in);
            String nameAns = scanner.next();
            System.out.println("What is their personal number?");
            int perNumbAns = scanner.nextInt();
            this.newUser = new User(nameAns, perNumbAns);
            Users.add(newUser);
            Bank bank = new Bank();
            bank.start();
        } catch (Exception e) {
            System.out.println("Invalid Datatype!");
        }

    }

    public void showAll() {  //SHOW ALL USERS
        Bank bank = new Bank();
        System.out.println("These are all current users");
        if (Users.size() == 0) {
            System.out.println("There are no users");
            bank.start();

        } else {
            for (User Users : Users) {
                System.out.println(Users.getName());
                System.out.println(Users.getPerNumber());
                System.out.println(Users.getClass());
            }
            bank.start();
        }
    }
    //getsett

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerNumber() {
        return perNumber;
    }

    public void setPerNumber(int perNumber) {
        this.perNumber = perNumber;
    }

}

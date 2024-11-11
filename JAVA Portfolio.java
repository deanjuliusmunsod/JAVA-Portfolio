import java.util.Scanner;

public class JavaPortfolio {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        // Your main program logic goes here

        scanner.close();
    }
}
import java.util.HashMap;

public class Bank {
    private HashMap<Integer, User> users;
    private User loggedInUser;

    public Bank() {
        users = new HashMap<>();
        users.put(412435, new User(412435, 7452, "Chris Sandoval", 32000));
        users.put(264863, new User(264863, 1349, "Marc Yim", 1000));
    }

    public boolean login(int id, int pin) {
        User user = users.get(id);
        if (user != null && user.getPin() == pin) {
            loggedInUser = user;
            System.out.println("Login successful! Welcome, " + loggedInUser.getName());
            return true;
        } else {
            System.out.println("Invalid ID or PIN.");
            return false;
        }
    }

    // Other methods go here, like checkBalance(), cashIn(), etc.

    private boolean isLoggedIn() {
        if (loggedInUser == null) {
            System.out.println("Please log in first.");
            return false;
        }
        return true;
    }
}



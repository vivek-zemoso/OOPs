import java.util.Scanner;

/*  class Account is a tightly Encapsulated Class
    A tightly encapsulated class is one, where all
    data memebers are private so that they can't be
    accessed by any other class. 

    Encapsulation is a OOP paradigm where we club
    all relevant information together and make a
    single entity that represents all of that
    information. Classes and Objects are primarily
    used for Encapsulation.

    Benefits :-
    1. Increased readability.
    2. Decreased code redundancy.
    3. Increased Modularity.
    4. Increased Accessibility.
*/

class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account acc = new Account();
        System.out.println(acc.getBalance());
        acc.setBalance(s.nextDouble());
        System.out.println(acc.getBalance());
        s.close();
    }

}

import java.util.Scanner;

interface Abstract {

    /*  was supposed to be purely abstract 
        but later versions of java allowed the entry of 
        "default", "static", and "private" metohds in an 
        interface. More info about interfaces in inheritance topic
    */
    
    public void abstractMethod(); // abstract by default

    public int abstractSum(int a, int b); //abstract by default
}

public class Abstraction implements Abstract {

    @Override
    public void abstractMethod() {
        System.out.println("Hi, I am an void type abstract method !!");
    }

    @Override
    public int abstractSum(int a, int b) {
        System.out.println("Hi, I am an int type abstract method !!");
        return a + b;
    }
}

class AbstractCient {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Abstraction abs = new Abstraction();
        abs.abstractMethod();
        System.out.println(abs.abstractSum(s.nextInt(), s.nextInt()));
        s.close();
    }
}
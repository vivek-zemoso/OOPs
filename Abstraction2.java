import java.util.Scanner;

abstract class Abstract {
    // can be partially abstract

    // not abstract method
    public void func() {
        System.out.println("I am defined inide abstract class");
    }

    abstract public int add(int a, int b);
}

public class Abstraction2 extends Abstract {

    @Override
    public int add(int a, int b) {
        System.out.println("I am implemented inside child class which is extending Abstract class !!");
        return a + b;
    }

}

class AbstractCient {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Abstraction2 abs = new Abstraction2();
        abs.func();
        System.out.println(abs.add(s.nextInt(), s.nextInt()));
        s.close();
    }
}
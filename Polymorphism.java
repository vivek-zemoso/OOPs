import java.util.Scanner;

class Parent {
    public int add(int a, int b) {
        System.out.println("adding two numbers from parent class");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("adding three numbers from parent class");
        return a + b + c;
    }
}

class Child extends Parent {
    @Override
    public int add(int a, int b) {
        System.out.println("adding two numbers from child class");
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Parent p = new Parent();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(p.add(a, b));
        System.out.println(p.add(a, b, c));
        Child ch = new Child();
        System.out.println(ch.add(b, c));
        System.out.println(ch.add(a, b, c));
        s.close();
    }
}

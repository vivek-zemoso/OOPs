
class Parent {
    private int parentVar = 10;

    public void printParentVar() {
        System.out.println("parent var is " + parentVar);
    }

    protected int addNumbers(int a, int b) {
        return a + b;
    }
}

class Child extends Parent {
    private int childVar = 100;

    public void printChildVar() {
        System.out.println("child var is " + childVar);
    }

    protected int addNumbers(int a, int b, int c) {
        return a + b + c;
    }
}

/*
 * When a single child class inherits a single
 * parent, then that type of inheritance is called
 * single iheritance.
 */

class GrandChild extends Child {
    private int grandChildVar = 1000;

    public void printGrandChildVar() {
        System.out.println("grandchild var is " + grandChildVar);
    }

    int addNumbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

/*
 * When a multiple classes performs inheritance and
 * forms a singluar chain like structure, for e.g.,
 * Parent ---> Child ---> GrandChild ---> so on...,
 * then that type of inheritance is called
 * multilevel iheritance.
 */

class AnotherChild extends Parent {
    private int anotherChildVar = 100;

    public void printAnotherChildVar() {
        System.out.println("another child var is " + anotherChildVar);
    }

    protected int multiplyNumbers(int a, int b, int c) {
        return a * b * c;
    }
}

/*
 * When a multiple classes inherits a single
 * parent, then that type of inheritance is called
 * hierarchical iheritance.
 */

/*
 * When a single child class inherits two or more
 * parent classes, then that type of inheritance
 * is called multiple inheritance. Howweeer, Java
 * does not allow multiple inheritance through the
 * use of classes. Multiple inheritance in java can
 * be achieved bia using either interfaces indirectly.
 */

interface Parent1 {
    public void parent1Method();

    public int parentSum(int a, int b);

    default void display() {
        System.out.println("I am a default method from Parent1 Interface");
    }
}

interface Parent2 {
    public void parent2Method();

    public int parentSum(int a, int b);

    default void display() {
        System.out.println("I am a default method from Parent2 Interface");
    }
}

class MultipleInheritanceExample implements Parent1, Parent2 {

    @Override
    public void parent2Method() {
        System.out.println("I am a  method from Parent2 Interface");
    }

    @Override
    public void parent1Method() {
        System.out.println("I am a  method from Parent2 Interface");
    }

    @Override
    public int parentSum(int a, int b) {
        return a + b;
    }

    @Override
    public void display() {
        Parent1.super.display();
        Parent2.super.display();
    }

}

public class Inheritance {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.printParentVar();
        System.out.println(p.addNumbers(10, 20));

        Child c = new Child();
        c.printChildVar();
        System.out.println(c.addNumbers(10, 20));
        System.out.println(c.addNumbers(10, 20, 30));

        GrandChild gc = new GrandChild();
        gc.printGrandChildVar();
        System.out.println(gc.addNumbers(10, 20));
        System.out.println(gc.addNumbers(10, 20, 30));
        System.out.println(gc.addNumbers(10, 20, 30, 40));

        AnotherChild ac = new AnotherChild();
        ac.printAnotherChildVar();
        System.out.println(ac.addNumbers(10, 20));
        System.out.println(ac.multiplyNumbers(12, 12, 12));

        MultipleInheritanceExample mice = new MultipleInheritanceExample();
        mice.parent1Method();
        mice.parent2Method();
        System.out.println(mice.parentSum(50, 150));
        mice.display();
    }
}

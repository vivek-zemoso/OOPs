class Car {
    private String name;
    private int price;
    private Engine engine;

    public Car(String name, int price, String e_no, int hp) {
        this.name = name;
        this.price = price;
        this.engine = new Engine(e_no, hp);
    }

    public void displayCarInfo() {
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.price);
        System.out.println("Engine :- ");
        engine.displayEngineInfo();
    }
}

class Engine {
    private String engine_no;
    private int horsePower;

    public Engine(String engine_no, int horsePower) {
        this.engine_no = engine_no;
        this.horsePower = horsePower;
    }

    public void displayEngineInfo() {
        System.out.println("Engine Number - " + this.engine_no);
        System.out.println("Horse Power - " + this.horsePower + " BHP");
    }
}

public class Composition {

    public static void main(String[] args) {

        Car p = new Car("Vivek Jain", 21, "DL_A65_0XLP_5644", 750);
        p.displayCarInfo();
    }
}

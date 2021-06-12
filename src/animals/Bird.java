package animals;

public class Bird extends Animal {
    public static String type() {
        return "Bird";
    }

    public Bird(String name) {
        super(name);
        this.legs = 2;
    }

    public void fly() {
        super.sayName();
        System.out.println("I'm flyinn` eeerre");
    }

    public void talk() {
        super.sayName();
        System.out.println("I'm chirpin` eeeeree!");
    }
}

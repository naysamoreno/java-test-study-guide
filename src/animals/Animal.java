package animals;

public class Animal {
    public static String type() {
        return "Animal";
    }
    private String name;

    // Field
    public int legs = 0;

    public void sayName() {
        System.out.println(this.name + " : ");
    }

    public void walk() {
        this.sayName();
        System.out.println("I'm walkin` eeeeree!");
    }

    public Animal(String name) {
        this.name = name;
    }
}

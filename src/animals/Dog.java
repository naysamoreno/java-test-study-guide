package animals;

public class Dog extends Animal{
    public static String type() {
        return "Dog";
    }

    public Dog(String name) {
        super(name);
        this.legs = 4;
    }
    public void bark() {
        System.out.println(Dog.type() + ": goes Woof Woof");
    }
    public void talk() {
        super.sayName();
        System.out.println("I'm wooofin 'errrre");
    }
}

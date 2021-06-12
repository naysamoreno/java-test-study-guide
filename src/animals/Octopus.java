package animals;

class Octopus extends Animal {
    public static String type() {
        return "Octopus";
    }

    public Octopus(String name) {
        super(name);
        this.legs = 8;
    }

    public void talk(int tentacles) {
        super.sayName();
        System.out.println("I have " + tentacles + " tentacles");
    }
}

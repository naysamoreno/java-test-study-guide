package animals;

public class Main {
    // polymorphism:
    // Can use different animals as if they are the same
    static void printAnimalType(Animal animal) {
        animal.sayName();
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Basic Animal");
        printAnimalType(animal);
        animal.walk();

        Bird bird = new Bird("Tweety");
        printAnimalType(bird);
        bird.walk();
        bird.fly();
        bird.talk();

        Octopus octo = new Octopus("Doctor");
        printAnimalType(octo);
        octo.walk();
        octo.talk(5);

        Dog doggy = new Dog("Doctor dog");
        printAnimalType(doggy);
        doggy.bark();
        doggy.talk();
    }
}

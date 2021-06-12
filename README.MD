# Table of Contents
1. [Encapsulation](#encapsulation)
2. [Inheritance](#inheritance)
3. [Method Overriding](#override)
4. [Method Overloading](#overload)
5. [Properties and Contructor](#properties)
6. [Static properties](#static)
7. [Polymorphism](#polymorph)
8. [Access Modifiers](#access)
9. [Error Handling](#error)

# Object Oriented Programming
## Terms
### Encapsulation <a id="encapsulation"></a>
```java
// hiding away complexity in an understandable way
public class Animal {
    public static void walk() {
        System.out.println("I'm walkin` eeeeree!");
    }
}
public static class Main {
    public static void main(String[] args) {
        Animal.walk();
    }
}
```
### Inheritance <a id="inheritance"></a>
```java
// Gains the methods and properties from the parent class
// using the `extends` key word
public class Animal {
    public static void walk() {
        System.out.println("I'm walkin` eeeeree!");
    }
}
public class Bird extends Animal {
    public static void fly() {
        System.out.println("I'm flyinn eeerre");
    }
    // Child classes can call parent methods with `super`
    public static void callParentWalk() {
        super.walk();
    }
}
public static class Main {
    public static void main(String[] args) {
        Animal.walk(); // "I'm walkin` eeeeree!"
        
        Bird.walk(); // "I'm flyinn eeerre"
    }
}
```
## Method Overriding <a id="override"></a>
```java
// A child class can override/overwrite methods from the parent class
public class Animal {
    public static void walk() {
        System.out.println("I'm walkin` eeeeree!");
    }
}
public class Bird extends Animal {
    // overrides the parent method because it has the same name
    public static void walk() {
        System.out.println("I'm chirpin` eeeeree!");
    }
}
public static class Main {
    public static void main(String[] args) {
        Animal.talk();  // "I'm talkin` eeeeree!"

        Bird.walk(); // "I'm chirpin` eeeeree!"
    }
}
```
## Method Overloading <a id="overload"></a>
```java
// A child class can overload methods from the parent class
// by making a method with the same name but different parameters 
// from the parent class
// If a method is overloaded, the parent method still works
public class Animal {
    public static void walk() {
        System.out.println("I'm walkin` eeeeree!");
    }
}
public class Octopus extends Animal {
    public static void talk(int tentacles) {
        System.out.println("I have " + tentacles + " tentacles");
    }
}
public static class Main {
    public static void main(String[] args) {
        Octopus.talk();  // "I'm talkin` eeeeree!"
        Octopus.talk(5);  // "I have 5 tentacles"
    }
}
```

## Properties and Constructors <a id="properties"></a>
A class can define properties that are specific to that class
child classes will inherit those properties. 

A class will typically set values for those properties inside its constructor
```java
public class Animal {
    // fields
    public String name;
    
    // constructor
    public Animal() {
        this.name = "`Animal`";
    }
    
    public void walk() {
        System.out.println(this.name + ": I'm walkin` eeeeree!");
    }
    public void talk() {
        System.out.println(this.name + ": I'm talkin` eeeeree!");
    }
}
public static class Main {
    public static void main(String[] args) {
        // calling a class contructor is know as instantiation
        Animal animal = new Animal();
        // you can access non-static properties after instantiating the class
        System.out.println(animal.name);
    }
}
```
## Static Properties <a id="static"></a>

Static properties are properties on the class that can be 
accessed without making a new class
```java
public class Animal {
    public static String type = "Animal";
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public static void walk() {
        System.out.println("I'm walkin` eeeeree!");
    }
    public talk() {
        System.out.println(this.name + ": I'm talkin` eeeeree!");
    }
}
public static class Main {
    public static void main(String[] args) {
        // static methods and properties can be used without constructing a new animal
        System.out.println(Animal.type); // prints "Animal"
        Animal.walk(); 
        
        // talk is not static so you must make a new animal instance 
        // before you can call the talk method
        Animal animal1 = new Animal("steve");
        animal1.talk(); // prints "steve: I'm talkin` eeeeree!"
        // Calling the same method on two different instances may not produce the same results
        Animal animal2 = new Animal("john");
        animal2.talk(); // prints "john: I'm talkin` eeeeree!"
    }
}
```
## Polymorphism <a id="polymorph"></a>
```java
public class Animal {
    public static void walk() {
        System.out.println("I'm walkin` eeeeree!");
    }
}
public class Octopus extends Animal {
    // overrides parent
    public static void walk() {
        System.out.println("I'm swimmin` eeeeree!");
    }
}
public class Main {
    // polymorphism:
    // Can use different animals as if they are the same
    static void makeAnimalWalk(Animal animal) {
        animal.walk();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Octopus octo = new Octopus(); 

        makeAnimalWalk(animal); // "I'm walkin` eeeeree!"
        // uses overriden octopus method
        makeAnimalWalk(octo); // "I'm swimmin` eeeeree!"
    }
}
```


## Access Modifiers <a id="access"></a>
- private - only accessible within class 
- public - accessible anywhere including outside of file
- protected - accessible only by class and subclasses

## Error Handling <a id="error"></a>
```java
int[] numbers = {1, 2, 3};
int x;

try {
    x = numbers[100];
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Caught an array index exception!");
} catch (Exception e) {
    System.out.println("Caught a generic exception!");
} finally {
    System.out.println("This will always run.");
}
```

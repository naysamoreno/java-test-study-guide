# Table of Contents
1. [Encapsulation](#encapsulation)
2. [Inheritance](#inheritance)
3. [Method Overriding](#override)
4. [Method Overloading](#overload)

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
        // instantiate Animal 
        Animal animal = new Animal();
        animal.walk();
    }
}
```
### Inheritance <a id="inheritance"></a>
```java
// Gains the methods from the parent class
// using the `extends` key word
public class Bird extends Animal {
    public static void fly() {
        System.out.println("I'm flyinn eeerre");
    }
}
public static class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.walk();
        
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
    }
}
```
## Method Overriding <a id="override"></a>
```java
// A child class can override/overwrite methods from the parent class
public class Bird extends Animal {
    public static void fly() {
        System.out.println("I'm flyinn eeerre");
    }
    public static void talk() {
        System.out.println("I'm chirpin` eeeeree!");
    }
}
public static class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.talk();  // "I'm talkin` eeeeree!"

        Bird bird = new Bird();
        bird.talk(); // "I'm chirpin` eeeeree!"
    }
}
```
## Method Overloading <a id="overload"></a>
```java
// A child class can overload methods from the parent class
// If a method is overload the parent method still works
public class Octopus extends Animal {
    public static void talk(int tentacles) {
        System.out.println("I have " + tentacles + " tentacles");
    }
}
public static class Main {
    public static void main(String[] args) {
        Octopus octo = new Octopus();
        octo.talk();  // "I'm talkin` eeeeree!"
        octo.talk(5);  // "I have 5 tentacles"
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
```
## Static Properties <a id="static"></a>

Static properties are properties on the class that can be 
accessed without making a new class

## Access Modifiers
private - only accessible within class 
public - accessible anywhere including outside of file
protected - accessible only by class and subclasses

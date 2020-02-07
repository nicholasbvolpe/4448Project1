import java.util.ArrayList;
import java.util.Random;

// Written by Nicholas Volpe

class Animal {
    // Every animal has a name
    String name;

    //Method definitions that are overridden by the subclasses
    void eat() {}
    void roam() {}
    void makeNoise() {}

    //Methods inherited and used by every subclass
    void sleep() {
        System.out.println(name + " sleeps");
    }
    void wakeup() {
        System.out.println(name + " awakens");
    }
}

// Inheritance depth 1, these animals inherit from the Pachyderm class
class Pachyderm extends Animal {
    // Methods shared by all of the Pachyderm animals
    public void roam() {
        System.out.println(name + " the Pachyderm roams");
    }
    public void eat() {
        System.out.println("*Munch munch munch*");
    }
}
// The Pachyderm animals
// Inheritance Depth 2, these animals inherit from the Pachyderm class
class Hippo extends Pachyderm {
    Hippo(String Name) {
        name = Name;
    }
    public void makeNoise() {
        System.out.println(name + " the hippo noise");
    }
}
class Elephant extends Pachyderm {
    Elephant(String Name) {
        name = Name;
    }
    public void makeNoise() {
        System.out.println(name + " the elephant noise");
    }
}
class Rhino extends Pachyderm {
    Rhino(String Name) {
        name = Name;
    }
    public void makeNoise() {
        System.out.println(name + " Rhino noise");
    }
}

// Inheritance depth 1, the Feline class inherits from the Animal class
class Feline extends Animal {
    // Methods shared by all of the Feline animals
    public void roam() {
        System.out.println(name + " the Feline prowls around");
    }
    public void eat() {
        System.out.println(name + " the Feline says 'this tastes great!'");
    }
}
// The Feline animals
// Inheritance Depth 2, the animals inherit from the Feline class
class Tiger extends Feline {
    Tiger(String Name) {
        name = Name;
    }
    public void makeNoise() {
        System.out.println(name + " the tiger roared");
    }
}
class Lion extends Feline {
    Lion(String Name) {
        name = Name;
    }
    public void makeNoise() {
        System.out.println(name + " the lion roared");
    }
}
class Cat extends Feline {
    Cat(String Name) {
        name = Name;
    }
    public void makeNoise() {
        System.out.println(name + " the cat meowed");
    }
    public void randomAction() {
        Random rand = new Random();
        int n = rand.nextInt(5) + 1;
        switch (n) {
            case 1: eat();
            case 2: roam();
            case 3: makeNoise();
            case 4: sleep();
        }
    }
}

// Inheritance depth 1, the Canine class inherits from the Animal class
class Canine extends Animal {
    // Methods shared by all of the Canine animals
    public void roam() {
        System.out.println(name + " the Canine runs around excitedly");
    }
    public void eat() {
        System.out.println("*crunch crunch crunch*");
    }
}
// The Canine animals
// Inheritance Depth 2, the Wolf and Dog class inherit from the Canine class
class Wolf extends Canine {
    Wolf(String Name) {
        name = Name;
    }
    public void makeNoise() {
        System.out.println(name + " the wolf howls");
    }
}
class Dog extends Canine {
    Dog(String Name) {
        name = Name;
    }
    public void makeNoise() {
        System.out.println(name + " the dog barks");
    }
}


class Zookeeper {
    // Each method takes in an Animal type object
    // All of our animals qualify because we used polymorphism
    void wake(ArrayList<Animal> zoo) {
        System.out.println("Wakeup time!");
        // A for each loop is used to access every animal in zoo
        // Then our zookeeper can perform his duties for each animal more efficiently
        for (Animal aZoo : zoo) {
            if (aZoo instanceof Cat) {
                ((Cat) aZoo).randomAction();
            }
            else {
                aZoo.wakeup();
            }
        }
    }
    void rollCall(ArrayList<Animal> zoo) {
        System.out.println("The zookeeper takes roll of the animals");
        for (Animal aZoo : zoo) {
            if (aZoo instanceof Cat) {
                ((Cat) aZoo).randomAction();
            }
            else {
                aZoo.makeNoise();
            }
        }
    }
    void feed(ArrayList<Animal> zoo) {
        System.out.println("The zookeeper gives food to all of the animals");
        for (Animal aZoo : zoo) {
            if (aZoo instanceof Cat) {
                ((Cat) aZoo).randomAction();
            }
            else {
                aZoo.eat();
            }
        }
    }
    void exercise(ArrayList<Animal> zoo) {
        System.out.println("The zookeeper plays with each animal in the zoo");
        for (Animal aZoo : zoo) {
            if (aZoo instanceof Cat) {
                ((Cat) aZoo).randomAction();
            }
            else {
                aZoo.roam();
            }
        }
    }
    void closeZoo(ArrayList<Animal> zoo) {
        System.out.println("The zookeeper makes sure each animal is in it's enclosure and closes the zoo");
        for (Animal aZoo : zoo) {
            if (aZoo instanceof Cat) {
                ((Cat) aZoo).randomAction();
            }
            else {
                aZoo.sleep();
            }
        }
    }
    void runTheZoo(ArrayList<Animal> zoo) {
        wake(zoo);
        rollCall(zoo);
        feed(zoo);
        exercise(zoo);
        closeZoo(zoo);
    }
}


public class main {
    public static void main(String[] args) {
        // Creating an instance of the Zookeeper class, our zookeeper is named Zach
        Zookeeper Zach = new Zookeeper();
        // This ArrayList will hold the instances of each animal
        ArrayList<Animal> zoo = new ArrayList<>();

        // Creating two instances of the Hippo class and putting them in the zoo by
        // adding them to the zoo ArrayList
        Hippo hippo0 = new Hippo("Hayden");
        Hippo hippo1 = new Hippo("Harry");
        zoo.add(hippo0);
        zoo.add(hippo1);

        // Creating two instances of the Elephant class and putting them in the zoo
        Elephant elephant0 = new Elephant("Eric");
        Elephant elephant1 = new Elephant("Eichler");
        zoo.add(elephant0);
        zoo.add(elephant1);

        // Creating two instances of the Rhino class and putting them in the zoo
        Rhino rhino0 = new Rhino("Ryan");
        Rhino rhino1 = new Rhino("Ray");
        zoo.add(rhino0);
        zoo.add(rhino1);

        // Creating two instances of the Lion class and putting them in the zoo
        Lion lion0 = new Lion("Larry");
        Lion lion1 = new Lion("Louis");
        zoo.add(lion0);
        zoo.add(lion1);

        // Creating two instances of the Tiger class and putting them in the zoo
        Tiger tiger0 = new Tiger("Terry");
        Tiger tiger1 = new Tiger("Tim");
        zoo.add(tiger0);
        zoo.add(tiger1);

        // Creating two instances of the Cat class and putting them in the zoo
        Cat cat0 = new Cat("Cyril");
        Cat cat1 = new Cat("Chance");
        zoo.add(cat0);
        zoo.add(cat1);

        // Creating two instances of the Wolf class and putting them in the zoo
        Wolf wolf0 = new Wolf("Warwick");
        Wolf wolf1 = new Wolf("William");
        zoo.add(wolf0);
        zoo.add(wolf1);

        // Creating two instances of the Dog class and putting them in the zoo
        Dog dog0 = new Dog("Daniel");
        Dog dog1 = new Dog("Danny");
        zoo.add(dog0);
        zoo.add(dog1);

        // Here Zach performs his daily duties at the zoo
        Zach.runTheZoo(zoo);
    }
}

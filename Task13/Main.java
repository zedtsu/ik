package Task13;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "This animal makes a sound.";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Woof!";
    }

    public String wagTail() {
        return "The dog is wagging its tail.";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow!";
    }

    public String purr() {
        return "The cat is purring.";
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        System.out.println("Task13.Dog name: " + dog.getName());
        System.out.println("Task13.Dog speak: " + dog.speak());
        System.out.println("Task13.Dog wag tail: " + dog.wagTail());

        Cat cat = new Cat("Whiskers");
        System.out.println("Task13.Cat name: " + cat.getName());
        System.out.println("Task13.Cat speak: " + cat.speak());
        System.out.println("Task13.Cat purr: " + cat.purr());
    }
}

package Task14;

import java.util.ArrayList;
import java.util.List;

class AnimalRegistry {
    private List<Animal> animals;

    public AnimalRegistry() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public Animal searchAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }
}

class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

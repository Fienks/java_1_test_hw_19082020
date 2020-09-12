package lesson6.animals;

import lesson6.animals.Animal;
import lesson6.animals.Cat;
import lesson6.animals.Dog;

public class Lesson6 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Murzik"),
                new Dog("Sharik"),
                new Cat("Pirate"),
                new Dog("Ziggi")
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(212);
            animals[i].swim(6);
        }
        System.out.println("Всего животных " + Animal.getAnimalCount());
        System.out.println("Котов всего " + Cat.getAnimalCount());
        System.out.println("Собак всего " + Dog.getAnimalCount());
    }
}

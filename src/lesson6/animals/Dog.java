package lesson6.animals;

public class Dog extends Animal {
    private static int animalCount;

    public Dog(String name) {
        super("Собака", name, 500, 10);
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

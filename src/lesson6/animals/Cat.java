package lesson6.animals;

public class Cat extends Animal {
    private static int animalCount;

    public Cat (String name){
        super("Кот", name, 200, 0);
        animalCount++;
    }
    public static int getAnimalCount(){
        return animalCount;
    }
}

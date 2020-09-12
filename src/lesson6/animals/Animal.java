package lesson6.animals;

public class Animal {
    String type;
    String name;


    int maxRunDistance;
    int maxSwimDistance;

    private static int animalCount;


    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " преодалена дистанция " + dist + " м.");
        } else {
            System.out.println(type + " " + name + " не может столько пробежать.");
        }

    }


    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать.");
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " проплыто " + dist + " м.");
        } else {
            System.out.println(type + " " + name + " не проплывет столько.");
        }

    }
    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }
}

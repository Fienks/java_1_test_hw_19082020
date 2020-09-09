package lesson5;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
  /*      Worker worker1 = new Worker();
        worker1.name = "Ivanov Ivan";
        worker1.position = "Engineer";
        worker1.email = "ivivan@mailbox.com";
        worker1.phone = "892312312";
        worker1.salary = 30000;
        worker1.age = 30;

        worker1.info();*/
        Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("Ivanov Ivan Ivanich", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        workersArray[1] = new Worker("Ivanov Petr Ivanich", "Engineer 2", "petr@mailbox.com", "892312442", 40000, 35);
        workersArray[2] = new Worker("Ivanov Vasya Ivanich", "Engineer 3", "petr@mailbox.com", "892314532", 50000, 39);
        workersArray[3] = new Worker("Ivanov Dima Ivanich", "Engineer 4", "petr@mailbox.com", "8923345342", 60000, 60);
        workersArray[4] = new Worker("Ivanov Gena Ivanich", "Engineer 5", "petr@mailbox.com", "8923345342", 70000, 70);


        for (Worker worker : workersArray) {
            if (worker.getAge() > 40) {
                worker.info();
            }
        }
    }

}

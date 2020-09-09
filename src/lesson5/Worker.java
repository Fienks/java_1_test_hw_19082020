package lesson5;

public class Worker {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Worker(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info() {

        System.out.printf("ФИО -  %s\n" +
                        "Должность - %s\n" +
                        "Email - %s \n" +
                        "Телефон - %s\n" +
                        "Зарплата - %d\n" +
                        "Возраст - % d\n",
                fullName, position, email, phone, salary, age);
    }
    public String getFullName(){
        return fullName;
    }
    public String getPosition(){
        return position;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
}

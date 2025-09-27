

import interfaces.EmailSender;

public class Employee implements EmailSender {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void calculateSalary() {
        this.salary = 0;
    }

    @Override
    public void sendEmail() {
    }
}

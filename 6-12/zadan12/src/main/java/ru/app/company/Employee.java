package ru.app.company;

public class Employee extends OrganizationComponent {
    public Employee(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Сотрудник: " + getName());
    }
}

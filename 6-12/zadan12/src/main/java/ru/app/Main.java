package ru.app;

import ru.app.company.Department;
import ru.app.company.Employee;

public class Main {
    public static void main(String[] args) {
        Department headOffice = new Department("Главный офис");
        Department itDepartment = new Department("ИТ отдел");
        Department hrDepartment = new Department("Отдел кадров");

        Employee alice = new Employee("Александр");
        Employee bob = new Employee("Дмитрий");
        Employee charlie = new Employee("Алексей");
        Employee diana = new Employee("Мария");

        itDepartment.add(alice);
        itDepartment.add(bob);
        hrDepartment.add(charlie);
        hrDepartment.add(diana);

        headOffice.add(itDepartment);
        headOffice.add(hrDepartment);

        headOffice.display();
    }
}

package ru.app.company;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public List<OrganizationComponent> getChildren() {
        return components;
    }

    @Override
    public void display() {
        System.out.println("Подразделение: " + getName());
        for (OrganizationComponent component : components) {
            component.display();
        }
    }
}

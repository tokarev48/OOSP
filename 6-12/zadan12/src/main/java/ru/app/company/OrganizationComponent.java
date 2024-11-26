package ru.app.company;

import java.util.ArrayList;
import java.util.List;

public abstract class OrganizationComponent {
    private String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }

    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }

    public List<OrganizationComponent> getChildren() {
        return new ArrayList<>();
    }

    public abstract void display();
}

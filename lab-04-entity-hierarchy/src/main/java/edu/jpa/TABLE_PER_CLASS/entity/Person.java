package edu.jpa.TABLE_PER_CLASS.entity;

import jakarta.persistence.*;

// marks this class as template for child entity clasess.
@MappedSuperclass
// defines the hierarchy mapping strategy to use.
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
    @Id
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

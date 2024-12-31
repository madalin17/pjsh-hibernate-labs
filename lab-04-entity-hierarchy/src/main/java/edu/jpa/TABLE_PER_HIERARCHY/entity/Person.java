package edu.jpa.TABLE_PER_HIERARCHY.entity;

import jakarta.persistence.*;

// marks class as entity-class
@Entity
// defines the hierarchy mapping strategy to use
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
// defines the database table field that will be used to keep discriminator value
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.STRING)
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

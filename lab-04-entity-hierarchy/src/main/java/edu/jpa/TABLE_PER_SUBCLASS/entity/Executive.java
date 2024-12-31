package edu.jpa.TABLE_PER_SUBCLASS.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

// marks class as entity-class
@Entity
public class Executive extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

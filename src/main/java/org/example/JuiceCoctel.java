package org.example;

import java.time.LocalDate;

public class JuiceCoctel extends Coctel {
    private LocalDate dueDate;

    public JuiceCoctel() {
    }

    public JuiceCoctel(String name, Long unitPrice, LocalDate dueDate) {
        super(name, unitPrice);
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}

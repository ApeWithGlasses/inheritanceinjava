package org.example;

public class Shot extends Coctel {
    private String type;

    public Shot() {
    }

    public Shot(String name, Long unitPrice, String type) {
        super(name, unitPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

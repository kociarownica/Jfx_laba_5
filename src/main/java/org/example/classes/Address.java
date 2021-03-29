package org.example.classes;

public class Address {
    private String street;
    private int house;
    private int flat;

    public Address(String street, int house, int flat)
    {
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public int getFlat() {
        return flat;
    }

    public int getHouse() {
        return house;
    }
}

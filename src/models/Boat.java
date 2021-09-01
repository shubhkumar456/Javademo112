package models;

public class Boat {

    String brand;
    int varities;
    String types;
    double price;

    public Boat(String brand, int varities, String types, double price) {
        this.brand = brand;
        this.varities = varities;
        this.types = types;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVarities() {
        return varities;
    }

    public void setVarities(int varities) {
        this.varities = varities;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

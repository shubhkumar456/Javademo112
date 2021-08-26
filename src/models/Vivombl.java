package models;

import java.util.ArrayList;

public class Vivombl {

   String brand;
   String manufacturer;
   int units;
   double price;

    public Vivombl(String brand, String manufacturer, int units, double price) {
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.units = units;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

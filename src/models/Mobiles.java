package models;

public class Mobiles {

    String brand;
    int ram;
    int rom;
    double price;

    public Mobiles(String brand, int ram, int rom, double price) {
        this.brand = brand;
        this.ram = ram;
        this.rom = rom;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

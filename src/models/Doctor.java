package models;

public class Doctor {

    String name;
    int age;
    double salary;
    String hospital;
    int nurse;

    public Doctor(String name, int age, double salary, String hospital, int nurse) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hospital = hospital;
        this.nurse = nurse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getNurse() {
        return nurse;
    }

    public void setNurse(int nurse) {
        this.nurse = nurse;
    }

    public void put(int i, String doctor) {
    }
}

package models;

public class Student {

    String name;
    int age;
    String section;
    double salary;

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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Student(String name, int age, String section, double salary) {
        this.name = name;
        this.age = age;
        this.section = section;
        this.salary = salary;


        // let use getter and setter //

    }
}

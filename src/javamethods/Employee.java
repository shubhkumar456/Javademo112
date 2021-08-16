package javamethods;

public class Employee {
    String company;
    int employers;
    double salary;
    String position;

    public void samsung(){
        System.out.println("it works on a samsung compay");
    }
    public void number(){
        System.out.println("there are fifteen hunded employee works on a company");
    }
    public void salary(){
        System.out.println("the salary of a employee on samsung company is 30000 ");
    }
    public void position(){
        System.out.println("the position of a employee for this compamy is manager");
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
          obj.salary();
          obj.position();
          obj.number();
          obj.samsung();

    }
}

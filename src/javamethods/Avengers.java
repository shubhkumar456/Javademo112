package javamethods;

public class Avengers {

    int people;
    String name;
    double num;
    String captain;

    public void people(){
        System.out.println("there is the twenty number in the team");
    }

    public void name(){
        System.out.println("The name of the agency who collect all the people is SHIELD");
    }

    public void num(){
        System.out.println("they all are in the form of the double power");
    }

    public void captain(){
        System.out.println("The captain of this team is Steve Rogers");
    }

    public static void main(String[] args) {
        Avengers obj = new Avengers();
        obj.people();
        obj.name();
        obj.num();
        obj.captain();
    }

}

package array;

public class Arraydemo6 {

    public void demo(){

        int [] marksarray={43,54,65,67,78,89,90,98,79,99};
        for (int var : marksarray){
            System.out.println("Insdie advance for loops  :-"+var);
        }


        String [] namearray={"Xmen", "Eric Xavier","Wolverine","Logan","Smith"};
        for (String name : namearray){
            System.out.println("Some name of the actors  :-"+name);
        }

        double [] variables={23.5,45.6,65.4,67.3,12.9};
        for (double input : variables){
            System.out.println("There are some inputs of doubles  :-"+input);
        }
    }


    public static void main(String[] args) {
        Arraydemo6 obj = new Arraydemo6();
        obj.demo();
    }
}

package iforelseconditions;

public class Iforelse {

    public static void main(String[] args) {

        int age = 33;
        String name = "shubendra";

        if (age>20 && name =="shubendra"){
            System.out.println("My name is shubendra and iam 23 year old");
        }
        else{
            System.out.println("My name is shubendra kumar and iam not 23 year old");
        }


        if(age<10 || name =="tundla"){
            System.out.println("My city name is Tundla and i am 30 year old");
        }

        else{
            System.out.println("My city name is Tundla junction and i am not 30 year old");
        }

        if (!(age>20)){
            System.out.println("my age is not this ");
        }

        else {
            System.out.println("also my name is wrong");
        }
        }
    }
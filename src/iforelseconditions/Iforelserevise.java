package iforelseconditions;

public class Iforelserevise {

    public static void main(String[] args) {
        int age = 20;
        if(age>10){
            System.out.println("i'm twenty year old");
        }
        else{
            System.out.println("I'm not twenty year old");
        }

        String name="Shubendra Kumar";

        if (name =="Shubendra kumar"){
            System.out.println("My name is Shubendra Kumar");
        }

        else{
            System.out.println("My name is not Shubendra Kumar My name is Chotu");
        }

        double wages =45345.87;
        if (wages>50120.90){
            System.out.println("The wages of an employee is more than thirty thousand rupees");
        }
        else{
            System.out.println("The wages of an employee is not more than thirty thousand rupees");
        }

        // using int or String //

        int ago = 15;
        String city = "Agra";

        if (ago>20 && city=="Tundla"){

            System.out.println("My age is greater than twenty year and I lived in Tundla");

        }
        else{
            System.out.println("Iam forty year old and i lived in agra");
        }

        if (age<10 || city=="Rishikesh"){
            System.out.println("I'm not an adult i'm a boy and i lived in Rishikesh");
        }

        else{
            System.out.println("I'm adult and i lived in Himachal pradesh");
        }

        if(!(age<10)){

            System.out.println("My age is not greater than twenty year");
        }

        else{
            System.out.println("My age is exact twenty year");
        }


        int var = 30;
        double input = 45550.60;

        if(var< 20 && input== 45550.60){
            System.out.println("My variable is more than twenty and input is 45550.60");

        }
        else{
            System.out.println("My variable is not more than twenty and input is 50000.80");
        }

        if (var>30 || input==60000.50){
            System.out.println("My variable is greater than or equal to thirty or input is 60000.50");
        }

        else{
            System.out.println("Inside the eklse statemet");
        }

        if(!(age>30)   ){
            System.out.println("My age is forty and lived in Haridwar");

        }
        else{
            System.out.println("inside the else statement");
        }



    }
}

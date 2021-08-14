package variablesconditions;

public class Conditions2 {

    public static void main(String args[]){

        int age=23;
        if (age<10){
            System.out.println("this is a young person");
        }
        else{
            System.out.println("this is not a young person");
        }
        double price=200.45;
        if (price<199.23){
            System.out.println("the price is too high........");
        }
        else{
            System.out.println("the price is not too high........");
        }
        String statement="false";
        if (statement=="true"){
            System.out.println("what iam asking is always true");
        }
        else {
            System.out.println("what iam asking is always not true");
        }
    }

}

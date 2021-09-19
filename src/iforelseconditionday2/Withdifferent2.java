package iforelseconditionday2;

public class Withdifferent2 {

    public static void main(String[] args) {

        double income = 65000.0;
        int people =8000;

        if(income<50000.0 && people ==8000){
            System.out.println("my income is more than fifty thousand and the number of people work in the company is :-"+people);
        }

        else{
            System.out.println("my income is not fifty thousand and the number of people work in the company is 4000 ");
        }

        int quantity =100;
        String product ="muscle blaze";

        if (quantity>190 || product =="muscle tech" ){
            System.out.println("The quantity of the muscle blaze product is hundred kilogram");
        }

        else{
            System.out.println("the quantity of the product ninty kilogram ");
        }

        int litre = 10;
        if (!(litre>8)){
            System.out.println("the quantity of the water bottle is ten litre");
        }
        else {
            System.out.println("the quantity of the water bottle is not ten litre");
        }


    }
}

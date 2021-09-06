package abstraction;

public class Abstract2 extends Interference2 {

    @Override
    public void mod() {
        int twentytwo = 22;
        for(int i=1; i<=10; i++){
            System.out.println("Print table twenty two :"+twentytwo*i);
        }
    }

    @Override
    public void mod1() {

        for (int i=0; i<=10; i++){
            System.out.println("Print my name Shubendra kumar");
        }

    }

    @Override
    public void mod2() {
        int seventy = 70;
        for (int i=10; i>0; i--){
            System.out.println("Print table seventy in reverse :-"+seventy*i);
        }

    }

    @Override
    public void mod3() {
        int twenntyfive = 25;
        int i=1;
        while(i<=10){
            System.out.println("Print table twenty five :"+twenntyfive*i);
            i++;

        }

    }

    @Override
    public void mod4() {
        int fortyfive = 45;
        int i= 10;
        while (i>0){
            System.out.println("Print table forty five :"+fortyfive*i);
            i--;

        }



    }

    public static void main(String[] args) {
        Abstract2 obj = new Abstract2();
        obj.mod();
        obj.mod1();
        obj.mod2();
        obj.mod3();
        obj.mod4();
    }


}

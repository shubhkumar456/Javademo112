package loops;

public class Whileloops {

    public static void main(String[] args) {
        int seven = 7;
        int i = 0;
        while (i <= 10) {
            System.out.println("hell yeah :" + seven * i);
            i++;
        }

        int fiftysix = 56;
        int a = 0;
        while (a <= 10) {
            System.out.println("print table of fifty six  :-" + fiftysix * a);
            a++;

        }

        int eleven = 11;
        int b = 0;
        while (b <= 10) {
            System.out.println("table of eleven " + eleven * b);
            b++;
        }

        double five = 5.0;
        double c = 0;
        while (c <= 10) {
            System.out.println("Table in decimals :" + five * c);
            c++;
        }


        int hundred = 100;
        int a1 = 10;
        while (a1 > 0) {
            System.out.println("Decrement of table 100 :" + hundred * a1);
            a1--;


        }

        double fifty=50.5;
        double b1= 10;
        while (b1>0){
            System.out.println("Another decrement of table fifty :"+fifty*b1);
            b1--;
        }
    }
}
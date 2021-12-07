package Factorial;

public class Factorial3 {
    public static void main(String[] args) {
        int x, var=1;
        int opt= 9;
        for (x=1;x<=opt;x++){
            var=var*x;
        }
        System.out.println("Factor of "+opt+" is "+var);
    }
}

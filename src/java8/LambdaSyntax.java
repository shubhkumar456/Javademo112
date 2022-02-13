package java8;

public class LambdaSyntax {

    public static void main(String[] args) {

        Addable withlamb = (int a,int b) -> (a+b);
        System.out.println(withlamb.add(100,400));

    }


}

package javamethods2;

public class calwithparam {

    public void add(int a, int b,int c,int d){
        int result =a+b+c+d;
        System.out.println("the sum of the numbers is :-"+result);
    }

    public void subs(int a, int b,int c,int d){
        int result =a-b-c-d;
        System.out.println("the sum of the numbers is :-"+result);

    }

    public void multi(int a,int b,int c,int d){
        int result =a*b*c*d;
        System.out.println("the sum of the numbers is :-"+result);
    }

    public void div(int a,int b,int c,int d){
        int result =a/b/c/d;
        System.out.println("the sum of the numbers is :-"+result);
    }

    public static void main(String[] args) {
        calwithparam obj = new calwithparam();
        obj.add(10,20,30,40);
        obj.subs(1000,200,300,100);
        obj.multi(20,30,40,50);
        obj.div(30000,10,20,30);
    }
}

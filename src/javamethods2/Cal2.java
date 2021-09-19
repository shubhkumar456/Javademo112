package javamethods2;

public class Cal2 {

    public void add(){
        int a = 45;
        int b = 67;
        int result = a+b;
        System.out.println("The sum of the no is  :-"+result);
    }

    public void div(){
        int a = 14;
        int b = 7;
        int result = a/b;
        System.out.println("The sum of the no is  :-"+result);
    }

    public void subs(){
        int a = 45;
        int b = 20;
        int result = a/b;
        System.out.println("The sum of the no is  :-"+result);
    }

    public void multi(){
        int a =12;
        int b =12;
        int result = a*b;
        System.out.println("The sum of the no is  :-"+result);
    }

    public static void main(String[] args) {
        Cal2 obj = new Cal2();
        obj.add();
        obj.div();
        obj.subs();
        obj.multi();
    }
}

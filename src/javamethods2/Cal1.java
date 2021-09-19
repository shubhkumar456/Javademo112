package javamethods2;

public class Cal1 {

    public void add(){
        int a = 2;
        int b = 3;
        int result = a+b;
        System.out.println("The sum of the no is  :-"+result);
    }

    public void div(){
        int a =10;
        int b =2;
        int result = a/b;
        System.out.println("The sum of the no. is  :-"+result);

    }

    public void subs(){
        int a = 20;
        int b = 7;
        int result = a-b;
        System.out.println("The sum of the no is  :-"+result);
    }

    public void multi(){
        int a = 4;
        int b = 5;
        int result = a*b;
        System.out.println("The sum of the no is  :-"+result);
    }

    public static void main(String[] args) {
        Cal1 obj = new Cal1();
        obj.add();
        obj.div();
        obj.subs();
        obj.multi();
    }
}

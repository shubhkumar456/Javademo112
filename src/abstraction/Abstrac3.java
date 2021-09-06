package abstraction;

public class Abstrac3 extends Interference3 {


    @Override
    public void multimethod() {
        int two =2;
        int i =1;
        while (i<=10){
            System.out.println("print table :-"+two*i);
            i++;
        }


    }

    @Override
    public void multimethod1() {
        int four = 4;
        for (int i=0; i<=10; i++){
            System.out.println("print table :-"+four*i);
            System.out.println("print table :- Shubendra"+i);

        }

    }

    @Override
    public void multimethod2() {
        int five = 5;
        for(int i=10; i>0; i--){
            System.out.println("print table :-"+five*i);
        }

    }

    @Override
    public void multimethod3() {
        int seven = 7;
        int i= 10;
        while(i>0){
            System.out.println("print table :-"+seven*i);
            i--;
        }

    }

    @Override
    public void multimethod4() {
        int eight = 8;
        int i =10;
        while(i>0){
            System.out.println("print table :-"+eight*i);
            i--;
        }

    }

    @Override
    public void multimethod5() {
        int ten = 10;
        for (int i=10; i>0; i--){
            System.out.println("print table :-"+ten*i);
        }

    }

    public static void main(String[] args) {
        Abstrac3 obj = new Abstrac3();
        obj.multimethod();
        obj.multimethod1();
        obj.multimethod2();
        obj.multimethod3();
        obj.multimethod4();
        obj.multimethod5();


    }


}


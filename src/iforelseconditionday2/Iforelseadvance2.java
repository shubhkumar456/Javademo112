package iforelseconditionday2;

public class Iforelseadvance2 {
    public static void main(String[] args) {
        int salary=20001;
        String name="jack sparrow";

        if(salary>20000 && name=="jack sparrow"){
            System.out.println("my salary is more than twenty thousand and name is jack sparrow");
        }
        else{
            System.out.println("my salary is not more than twenty thousand and name is not jack sparrow");
        }
        if(salary>20000 || name=="ethan hunt"){
            System.out.println("my salary is less than twenty thousand and name is jack sparrow");
        }
        else{
            System.out.println("what iam saying is always not true");
        }
        if(!(salary<20000)){
            System.out.println("finally i learn this advance statement");
        }
        else{
            System.out.println("but i have done only three exercise of this condition");
        }


    }
}

package iforelseconditionday2;

public class Iforelseadvance {

    public static void main(String[] args) {

        int age=9;
        String name = "shubendra";
        if(age<10 && name=="shubendra"){
            System.out.println("my age is ten and my name is shubendra");
        }
        else{
            System.out.println("my age is not ten and my name is not shubendra");
        }
        if (age>8 || name=="solmon"){
            System.out.println("my age is ten and m name is shubendra");
        }
        else{
            System.out.println("tthis is the else block of or opr");
        }
        if (!(age<8)){
            System.out.println("if block condition is true");
        }
        else{
            System.out.println("else block condition is false");
        }
    }
}

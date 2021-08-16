package iforelseconditions;

public class Conditions5 {
    public static void main(String[] args) {
        int age= 10;
        String name="javaprogram";
        if (age>20 && name=="javaprogram"){
            System.out.println("my age is thirty and iam learning a java program");
        }
        else{
            System.out.println("my age is not thirty and iam not learning a java program");
        }
        if (age>9 || name=="python"){
            System.out.println("my age is ten and iam learning a java program");
        }
        else{
            System.out.println("my age is thirty and iam learning a python program");
        }
        if(!(age>9)){
            System.out.println("if block follows not condition");
        }
        else{
            System.out.println("else block follow not condition");
        }
    }
}

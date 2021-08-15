package iforelseconditionday2;

public class Day2 {
    public static void main(String[] args) {

        int age= 16;
        String city="TUNDLA";
        if(age>15 && city=="TUNDLA"){

            System.out.println("iam young and i lived in tundla");
        }
        else{
            System.out.println("iam not young and not lived in tundla");
        }
        if(age>17 || city=="agra"){
            System.out.println("this person is young and not lived in tundla");
        }
        else{
            System.out.println("this person is not young and not lived in tundla");
        }
        if (!(age<10)){
            System.out.println("the if block statement is false");
        }
        else{
            System.out.println("this is the else block statemrnt");
        }
    }
}

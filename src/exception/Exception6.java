package exception;

public class Exception6 {

    public void div(int a,int b){
        int result = 0;
        try {
            result =a/b;
        }

        catch (java.lang.Exception e){
            System.out.println("this is the sixth method i have tried "+e);
        }

        finally {
            System.out.println("This method will run in all conditions");
        }
        System.out.println("This is old method :"+result);
    }

    public void errorexception() throws java.lang.Exception{
        throw new java.lang.Exception();
    }

    public static void main(String[] args) {
        Exception6 obj = new Exception6();
        obj.div(12,0);

        try {
            obj.errorexception();
        } catch (java.lang.Exception e) {
            System.out.println("Turn down for what  ");
        }
    }
}

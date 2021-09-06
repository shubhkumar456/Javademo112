package exception;

public class Exception3 {

    public void div(int a, int b){

        double result = 0;
        try {
            result = a/b;
        }
        catch (java.lang.Exception e){
            System.out.println("Exception occured but handled :-"+e);
        }

        finally {
            System.out.println("finally method run either exception occured or not");
        }

        System.out.println("print divide "+result);

    }

    public void throwexception() throws java.lang.Exception{
           throw  new java.lang.Exception();
    }

    public static void main(String[] args) {
        Exception3 obj = new Exception3();
        obj.div(12,0);

        try {
            obj.throwexception();
        } catch (java.lang.Exception e) {
            System.out.println("Exception occured but handled :-"+e);
        }
    }
}

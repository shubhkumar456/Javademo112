package exception;

public class Exception2 {

    public void div(int a, int b){

        int result =0;
        try {
            result =a/b;
        }
        catch (java.lang.Exception e){
            System.out.println("exception occured but handles "+e);
        }

        finally {
            System.out.println("exception occured or not but it handles ");
        }
        System.out.println("print output of addition :-"+result);

    }

    public void throwexception() throws java.lang.Exception{
        throw new java.lang.Exception();

    }


    public static void main(String[] args) {
        Exception2 obj = new Exception2();
        obj.div(10,0);

        try {
            obj.throwexception();
        } catch (java.lang.Exception e) {
            System.out.println("exception occured but handles "+e);
        }
    }


}

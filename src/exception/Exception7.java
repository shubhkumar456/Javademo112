package exception;

public class Exception7 {

    public void div(int a, int b){
        int result =0;
        try{
            result =a/b;
        }

        catch (java.lang.Exception e){
            System.out.println("This is the exception handled method "+e);
        }

        finally {
            System.out.println("This is the best method because it will give result in all conditions ");
        }
        System.out.println("The seventh result of the division :"+result);
    }

    public void leaveexception() throws java.lang.Exception{
        throw new java.lang.Exception();
    }

    public static void main(String[] args) {
        Exception7 obj = new Exception7();
        obj.div(15,0);

        try {
            obj.leaveexception();
        } catch (java.lang.Exception e) {
            System.out.println("Now i completed my late work which i have not done");
        }
    }
}

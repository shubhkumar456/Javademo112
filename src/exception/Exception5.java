package exception;

public class Exception5 {

    public void div(int a, int b){
        int result = 0;

        try {
            result = a/b;
        }

        catch (java.lang.Exception e){
            System.out.println("There is some error but cleared");
        }

        finally {
            System.out.println("There is error coming or not but it runs");
        }
        System.out.println("the result of subs :-"+result);
    }

    public void outexception() throws java.lang.Exception{
        throw new java.lang.Exception();
    }

    public static void main(String[] args) {
        Exception5 obj = new Exception5();
        obj.div(10,0);

        try {
            obj.outexception();
        } catch (java.lang.Exception e) {
            System.out.println("Yes i have changed the name of the exception");
        }
    }
}

package exception;

public class Excetion4 {

    public void div(int a ,int b){
        int result = 0;
        try {
            result = a/b;
        }
        catch (java.lang.Exception e){
            System.out.println("there is exception here but handled :-"+e);
        }

        finally {
            System.out.println("There is exception or not but it will run ");
        }

        System.out.println("print divide "+result);
    }

    public void throwsexception() throws java.lang.Exception{
        throw new java.lang.Exception();
    }

    public static void main(String[] args) {
        Excetion4 obj = new Excetion4();
        obj.div(35,0);

        try {
            obj.throwsexception();
        } catch (java.lang.Exception e) {
            System.out.println("my name is Mr. Shubendra Kumar");
        }
    }
}

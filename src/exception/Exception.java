package exception;

public class Exception extends Throwable {

    public void divide(int a, int b){

        int result = 0;
            try {
            result = a / b;
            }

            catch (java.lang.Exception e){
                System.out.println("Excption occured but handled "+e);
            }
            finally {
                System.out.println("This is finally block it executed everytime");
            }


        System.out.println("The result of the division :"+result);

    }

    public  void throwexception() throws java.lang.Exception {

        throw new java.lang.Exception();
    }

    public static void main(String[] args) {
        Exception obj = new Exception();
        obj.divide(10,0);

        try {
            obj.throwexception();
        } catch (java.lang.Exception e) {
            System.out.println("Try out the TRY or Catch method "+e);
        }
    }
}

package methodswithreturntype;

public class ReturnType {

    public String demo(){
        String name="Java Software";
        return name;

    }

    public String message(String msg){
        String name= "Welcome to the world of "+msg;
        return name;

    }

    public String software(String software){

        String output= "the java company create a many software the name of the software is "+software;
        return output;
    }

    public int demoint() {

        return 431233;
    }
    public int demoint2(){

        return 12432;
    }


    public static void main(String[] args) {
        ReturnType obj = new ReturnType();
         String pop= obj.demo();
         System.out.println(pop);

         String var=obj.message("core java");
         System.out.println(var);

         String jav= obj.software("opera mini");
         System.out.println(jav);

         int result =obj.demoint();
         System.out.println(result);

         int output= obj.demoint2();
         System.out.println(output);

    }
}

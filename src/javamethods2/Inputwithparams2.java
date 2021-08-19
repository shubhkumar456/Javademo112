package javamethods2;

public class Inputwithparams2 {

    public void multipleparams(String name,int age,double number,int varible,String company,double money,String city){

        System.out.println("name is -" +name + "age is -" +age + "my uncle age is double - "+ number + "number of employeeis -"+ varible +"the name of the brand is -"+company +"price of the the product statrting from -"+money + "my birth place is -" +city );


    }

    public static void main(String[] args) {
        Inputwithparams2 obj = new Inputwithparams2();
          obj.multipleparams("shubendra kumar",24,48.5,9876,"vivo mobile india",17599.5,"Tundla");

    }
}

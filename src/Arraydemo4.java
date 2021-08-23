public class Arraydemo4 {

    public void demo(){

        int [] number={23,76,65,34,78,34,878,778,98,90,00,21,13};
        for (int var : number){
            System.out.println("inside for loop advandce  :-"+var);
        }


        String [] products={"Haldiram","Bikaner","Bicano","Parle Agro","Thumbs Up","Pepsico"};
        for(String demand : products){
            System.out.println("There are some brans in the market  :-"+demand);
        }

        double [] pointvalue={199.9,299.8,399.9,599.9,899.9,799.9,900.5,499.5};
        for (double values : pointvalue){
            System.out.println("There are some examples of advance for loop in double  :-"+values);
        }
    }


    public static void main(String[] args) {
        Arraydemo4 obj = new Arraydemo4();
        obj.demo();
    }
}

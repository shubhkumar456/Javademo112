package array;

public class Arraydemo3 {

    public void demo(){

        double[] pays={54550.7,67000.7,56700.8,43670.7,89990.9,67560.8};
        for (double salary: pays){
            System.out.println("There are some pays in doubles  :-" +salary);
        }


        String[] actors={"Salman Khan","Arnold Schwarzenneger","Scott Adkins","Michael Jay White","Jason Statham","Dwayne Johnson","Rajkumar Rao"};
        for (String names : actors){
            System.out.println("Here are the list of my favourite actors  :-"+names);
        }

        int [] prices={399,459,299,199,699,769,799,899,1099};
        for (int var : prices){
            System.out.println("All malls and shops have tag like this  :-"+var);
        }
    }

    public static void main(String[] args) {
        Arraydemo3 obj = new Arraydemo3();
        obj.demo();
    }
}

package array;

public class Arraydemo5 {

    public void demo(){

        int [] table={2,4,6,8,10,12,14,16,18,20};
        for (int series : table){
            System.out.println("Printing the table of two  :-"+series);
        }

        double [] formation={3.3,6.6,9.9,12.12,15.15,18.18,21.21,24.24,27.27,30.30};
        for (double var : formation ){
            System.out.println("There are some pointable values  :-"+var);
        }

        String [] cities={"Agra","Delhi","Anand Vihar","Ambala","Chandigarh","Gurgaon"};
        for (String visit : cities){
            System.out.println("There are some places to visit from  :-"+visit);
        }


    }

    public static void main(String[] args) {
        Arraydemo5 obj = new Arraydemo5();
        obj.demo();
    }
}

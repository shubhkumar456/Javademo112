package array;

public class Arrayrevise {

    public void demo(){

        int [] numarray={12,23,34,45,56,667,};
        for(int var : numarray)
        System.out.println("lets have the print of integer values   "+var );


        String [] namearray={"Mr.Shanta Ram","Smt. Pushpa Devi","Beena Rani","Deeksha Kumari","Hitendra Kumar","Parmendra Kumar","Shubendra Kumar"};
          for (String var : namearray){
              System.out.println("This is My Family :"+var);
          }


          double [] salsarray ={2034.4,3000.5,5674.5,9876.8,12345.9,20009.5};
          for (double salary : salsarray){
              System.out.println("These are some types of salary in decimals  :"+salary);
          }
    }

    public static void main(String[] args) {
        Arrayrevise obj = new Arrayrevise();
        obj.demo();
    }
}

package array;

public class Arraydemo2 {
      public void demo2() {
            String[] namearray = {"java", "core java", "spring boot", "oracle", "mammoth", "orkut", "gmail"};

            for (String var : namearray) {
                  System.out.println("inside the index of advance for loops  " + var);

            }

            int [] marksarray={76,78,89,68,67,90,97,95};
            for (int marks: marksarray){
                  System.out.println("there are some number of class topper:- "+marks);
            }

            double[] doubles={98.6,89.9,97.5,90.5,87.9,95.7,99.9,99.6};
            for (double remarks: doubles){
                  System.out.println("here are some remarks in doubles  :-"+remarks);
            }
      }

      public static void main(String[] args){
                  Arraydemo2 obj = new Arraydemo2();
                  obj.demo2();

      }
}

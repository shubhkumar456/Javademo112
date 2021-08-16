package javamethods;

public class Student {
    String name;
    int age;
    int fees;
    String schoolname;

    /*read,write,dance,learn,run*/
   public void read(){
       System.out.println("the student read a book of gulliver travels");
   }
   public void dance(){
       System.out.println("there is a good dance performance by student");
   }
   public void write(){
       System.out.println("the student writes a poem");
   }
   public void learn(){
       System.out.println("the student learn some vocabulary words");
   }
   public void run(){
       System.out.println("the student going for running daily in the morning");
   }

    public static void main(String[] args) {
        Student obj= new Student();
         obj.read();
        obj.write();
        obj.dance();
        obj.run();
        obj.learn();
    }

}

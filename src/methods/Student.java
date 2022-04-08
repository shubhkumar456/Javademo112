package methods;

public class Student {

//    String name;
//    int age;
//    String sec;

//    read, write, play, eat

//      public void read(){
//           System.out.println("a student rea the books.........!!!!!!!!!!");
//}
//     public  void wirte(){
//         System.out.println(" A student writing an application............!!!!!!!!!!!!!!!!!");
//     }
//    public  void play(){
//        System.out.println(" A student playing  a games............!!!!!!!!!!!!!!!!!");
//    }
//    public  void eat(){
//        System.out.println(" A student eating a fast food............!!!!!!!!!!!!!!!!!");
//    }
    public int add(int a, int b){
//        int a=10;
//        int b=20;
        int result=a+b;
        return result;
//        System.out.println("addition is....!!!!"+result);
    }

    public int mul(int a, int b){
//        int a=10;
//        int b=20;
        int result=a*b;
        return result;
//        System.out.println("multiply is....!!!!"+result);
    }
    public int subs(int a, int b){
//        int a=100;
//        int b=20;
        int result=a-b;
        return result;
//        System.out.println("substraction is....!!!!"+result);
    }
    public int div(int a, int b) {
//        int a = 1000;
//        int b = 20;
        int result = a / b;
        return result;
//        System.out.println("division is....!!!!" + result);
    }
    public static void main(String[] args) {
        Student obj = new Student();
       int a= obj.add(10,20);
       System.out.println("addition is....!!!!-->"+a);

       int b= obj.div(1250,2);
       System.out.println("division is....!!!!-->"+b);

       int c= obj.mul(12,12);
        System.out.println("multiply is....!!!!-->"+c);

       int d= obj.subs(100,87);
        System.out.println("substraction is....!!!!-->"+d);

//        obj.read();
//        obj.wirte();
//        obj.play();
//        obj.eat();
    }






}

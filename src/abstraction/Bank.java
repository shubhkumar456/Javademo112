package abstraction;//package abstraction;
//
//interface Bank{
//    float rateOfInterest();
//}
//class SBI implements Bank{
//    public float rateOfInterest(){return 9.15f;}
//}
//class PNB implements Bank{
//    public float rateOfInterest(){return 9.7f;}
//}
//class TestInterface2{
//    public static void main(String[] args){
//        Bank b=new SBI();
//        System.out.println("ROI: "+b.rateOfInterest());
//    }}

interface Printable{
    void print();
}
interface Showable{
    void print();
}

class TestInterface3 implements Printable, Showable{
    public void print(){System.out.println("Hello");}
    public static void main(String args[]){
        TestInterface3 obj = new TestInterface3();
        obj.print();
    }
}
public class Compre {

    String s1 = "Nabeen";
    String s2 = new String("Nabeen");

    String s3=s2;


    public static void main(String[] args) {
        String s1 = "Nabeen";
        String s2 = new String("Nabeen");

        String s3=s2;
    Compre obj = new Compre();
    obj.s1= obj.s2;
    obj.s3= obj.s2;
        System.out.println(obj.s1);
        System.out.println(obj.s3);


    }

}

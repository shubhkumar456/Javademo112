package classandobject;

public class School {
    String name= "st.johns college";
    int student = 5000;
    double fees =15000.4;
    int teacher = 100;
    int principal = 1;

    public static void main(String[] args) {
        School object = new School();
        System.out.println(object.name);
        System.out.println(object.student);
        System.out.println(object.teacher);
        System.out.println(object.principal);
        System.out.println(object.fees);


        School object2 = new School();
        System.out.println(object2.name);
        System.out.println(object2.student);
        System.out.println(object2.teacher);
        System.out.println(object2.fees);
        System.out.println(object2.principal);
    }
}

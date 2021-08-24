package classandobject2;

public class TypesOfAC {
    String name;
    int types;
    double prices;
    String manufacture;
    int warrant;

    public TypesOfAC(String name, int types, double prices, String manufacture, int warrant) {
        this.name = name;
        this.types = types;
        this.prices = prices;
        this.manufacture = manufacture;
        this.warrant = warrant;
    }


    public static void main(String[] args) {
        TypesOfAC obj = new TypesOfAC("Lloyd Air Conditioner",3,45000.3,"Havell's Brand Company",5);

        System.out.println(obj.name );
        System.out.println(obj.types);
        System.out.println(obj.prices);
        System.out.println(obj.manufacture);
        System.out.println(obj.warrant);
    }
}

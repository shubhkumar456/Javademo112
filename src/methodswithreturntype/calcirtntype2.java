package methodswithreturntype;

public class calcirtntype2 {

    public double add(double a, double b, double c, double d, double e){
        double output=a+b+c+d+e;
        return output;
    }

    public double multi(double a, double b, double c, double d, double e){
        double output=a*b*c*d*e;
        return output;
    }

    public double subs(double a, double b, double c, double d, double e){
        double output=a-b-c-d-e;
        return output;
    }

    public double div(double a, double b, double c, double d, double e){
        double output=a/b/c/d/e;
        return output;
    }




    public static void main(String[] args) {
        calcirtntype2 obj= new calcirtntype2();
        double output=obj.add(32.3,43.4,65.4,12.3,10.4);
        System.out.println("Addition in double condition  "+output);

       double answer= obj.multi(21.4,12.4,32.3,43.2,23.5);
       System.out.println("the answer of the multiple no. in multiplication is  "+answer);


       double result= obj.subs(4000.0,234.5,343.2,534.1,123.8);
       System.out.println("the result of the numbers is  "+result);



       double var= obj.div(10000.4,20.5,10.4,15.5,11.6);
       System.out.println("the sum of the multiple variable is  "+var);

    }
}

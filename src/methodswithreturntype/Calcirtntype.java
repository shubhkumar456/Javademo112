package methodswithreturntype;

public class Calcirtntype {

    public int add(int a,int b,int c,int d,int e){
        int multi=a+b+c+d+e;
        return multi;
    }

    public int subs(int a,int b,int c,int d,int e){
        int multi=a-b-c-d-e;
        return multi;
    }

    public int div(int a,int b,int c,int d,int e){
        int multi=a/b/c/d/e;
        return multi;
    }

    public int into(int a,int b,int c,int d,int e){
        int multi=a*b*c*d*e;
        return multi;
    }




    public static void main(String[] args) {
        Calcirtntype obj=new Calcirtntype();
        int result=obj.add(10,30,40,50,70);
        System.out.println("the sum of multiple no. in addition is  "+result);

        int ans =obj.subs(450,20,30,40,50);
        System.out.println("the sum of the subs is  "+ans);

        int value=obj.div(2000,4,5,6,8);
        System.out.println("Sum of a disisble no is  "+value);

        int output= obj.into(12,23,34,45,54);
        System.out.println("the multiplication of multiple number is  "+output);



    }
}

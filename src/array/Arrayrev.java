package array;

public class Arrayrev {

    public void demo(){

        String [] namearray={"Chotu","parmnedra","Mintu","Gulshan","golu"};
        for(String out : namearray){
            System.out.println("inside namearray "+out);
        }

        String [] namarray ={"john ","smith","julia","jonas","nick"};
        for(int i=0 ; i< namarray.length;i++){
            System.out.println("inside namearray "+namarray[i]);

        }

        int [] numsarray = {12,23,34,45,56,67,78,9};
        for (int nom : numsarray){
            System.out.println("inside namearray "+nom);
        }

        double [] dblarray ={12.0,13.0,23.0,30.0,40.0,50.0};
        for (double nom : dblarray){
            System.out.println("inside namearray "+nom);
        }

        String [] names={"YogiJi","Narendra Modi ji","MayaVatiJi","Arvind Kejrival","Atal Bihari Bajapi"};
        for(int i=0; i<names.length; i++){
            System.out.println("There Are the name of the some great leaders  "+names[i]);
        }

        String [] nami={"Vivo","Oppo","One Plus","IPhone","Samsung","Motorola","Lenovo"};
        for (String out : nami){
            System.out.println("Here are some popular brands in the market  :-"+out);
        }
    }

    public static void main(String[] args) {
        Arrayrev obj = new Arrayrev();
        obj.demo();
    }
}

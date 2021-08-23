package array;

public class Arraydemo{

    public void demo(){
        String[] namearray={"john","smith","john carter","stewin lewis"};
        for(int i=0; i< namearray.length; i++){
            System.out.println("list of a faewell candidates    "   +namearray [i] +  "     index wise  "+i);
        }

        int [] intarrays={321,234,765,879,123,98,546};
        for(int i=0; i< intarrays.length; i++){
            System.out.println("here are some variables of a number  "+intarrays[i]);
        }

    }

    public static void main(String[] args) {
        Arraydemo obj = new Arraydemo();
        obj.demo();
    }



}

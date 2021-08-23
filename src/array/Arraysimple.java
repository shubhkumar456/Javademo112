package array;

public class Arraysimple {

    public void demo(){
        String [] namesarray={"John Wick","Oculus","Avengers Infinity war","Undisputed","Boyka Undisputed"};
        for (int i=0; i<namesarray.length; i++){
            System.out.println("here are some movies and movie characters  :-"+namesarray[i] + "  Point Number"+i);
        }
    }

    public static void main(String[] args) {
        Arraysimple obj = new Arraysimple();
        obj.demo();
    }
}

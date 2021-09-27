package revision;


import java.util.ArrayList;
import java.util.List;

public class Arralist2 {

    public void demo() {

        List game = new ArrayList();

        game.add("The first game i played is Super mario");
        game.add("and the another one is Contra");
        game.add("The adventure island is also an awesome game");
        game.add("Tekken 3 was a very superb game ");
        game.add("The i have play temple run, subway surfer, candy crush etc;");
        game.add("The Last game i have played much more that is pubg i loved it ");


        System.out.println(game.get(0));
        System.out.println(game.get(1));
        System.out.println(game.get(2));
        System.out.println(game.get(3));
        System.out.println(game.get(4));
        System.out.println(game.get(5));

        game.remove(0);
        game.remove(1);

        for(Object var : game){
            System.out.println("After removing some index we get this"+var);
        }



    }

    public void demo2(){

        List mobiles = new ArrayList();

        mobiles.add("Apple Iphone ");
        mobiles.add("Tech One Plus");
        mobiles.add("India Samsung");
        mobiles.add("Vivo Made In India");
        mobiles.add("Oppo From India");

        System.out.println(mobiles.get(0));
        System.out.println(mobiles.get(1));
        System.out.println(mobiles.get(2));
        System.out.println(mobiles.get(3));
        System.out.println(mobiles.get(4));

        mobiles.remove(0);
        mobiles.remove(3);
        mobiles.remove(2);

        for(Object variations : mobiles){
            System.out.println("We get this from remove method  "+variations);
        }




    }

    public static void main(String[] args) {

        Arralist2 obj = new Arralist2();
        obj.demo();
        obj.demo2();
    }
}
;

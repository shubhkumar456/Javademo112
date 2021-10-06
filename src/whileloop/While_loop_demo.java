package whileloop;

public class While_loop_demo {

    public static void main(String[] args) {

        int i=1;
        while(i<5){
            System.out.println("Hello world  "+i);
            i++;
            if (i==3){
                break;
            }

        }

        int five =5;
        int j =1;
        while(j<=10){
            System.out.println("Printing table of five "+five*j);
            j++;
            if (j==6){
                break;
            }
        }

        int two = 2;
        int k = 10;
        while(k>0) {
            System.out.println("Decrement of table two:- "+two*k);
            k--;
            if (k==5){
                break;
            }

        }

        int thirty_seven = 37;
        int l = 1;
        while (l<=10){
            System.out.println("Print table of thirtyseven :-"+thirty_seven*l);
            l++;
            if (l==5){
                break;
            }
        }

        int forty_eight = 48;
        int x = 10;
        while (x>0){
            System.out.println("decrement of table fortyeight :-"+forty_eight*x);
            x--;
            if (x==5){
                break;
            }
        }

        }
        }



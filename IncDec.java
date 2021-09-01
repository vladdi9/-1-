package Service;

public class IncDec {
    public static void main(String[] args) {
        int x,y;
        x=1;
        y=x++;//x=1 y=x, x=x+1
        System.out.println(x+"  " + y);


        x=1;
        y=++x; //x=1, x=x+1, y=x
        System.out.println(x+"  " + y);

        x=1;
        y=x--;
        System.out.println(x+"  " + y);

        x=1;
        y=--x;
        System.out.println(x+"  " + y);


        //x-- декремент
        //--x предикримент


    }
}

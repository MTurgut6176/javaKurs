package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {

        int a=5;

        // Post Icrement
        int b =a++;
        System.out.println(b); // 5 ; buradan 5 sonucunu aliriz cunku java soldan gelirken once a yi okudu
        System.out.println(a); //6

        // pre Increment
        int c=10;
       int d= ++c;
        System.out.println(d);//11 olur burada once ++ olanlari okudu sonra c yi ekledi
        System.out.println(c);

        //post Dicrement
        int e =20;
        int f=e--; // 20 olur
        System.out.println(f);
        System.out.println(e);//19 aliriz

        //Pre Decrement
        int h= 30;
        int i = --h;
        System.out.println(i); //29
        System.out.println(h); // 29
    }
}

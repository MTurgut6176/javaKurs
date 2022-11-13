package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {
     /*
     Method Overloadin nasil yapilir
     1- method isimleri ayni olmali
     2- method parametreleri sayisisi fakli olmali
     3- para netrelerin data typlerini degistirebilirsini
     4-para metrelerin yerlerini degistirebilirsiniz ancak daat typleri farkli olmali
     5-Method ismi + parametreler=methodub imzasi(signatur)
     6-Method signatur diainda ne degistirirseniz degistirin java o methodlari fark etmez
      */
        add(3,5);
        add(3,5.0);

    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
        public static void add(int a, double b){
            System.out.println(a + b );
        }

        public static void add(double a, int b){
            System.out.println(a + b);
        }
    }

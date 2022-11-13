package day07ternarystringmanipulation;

import javax.print.DocFlavor;

public class NestedTernary01 {

    public static void main(String[] args) {



        /*       Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.

                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-

         */

        int year = 2020;

        String leap = year % 100 == 0 ? (year % 400 == 0 ? "Leap year" : "Leap year degil") : (year % 4 == 0 ? "Leap year " : "Leap year degil");

        System.out.println(leap);

        /*
        asagidaki kurallara gore password un gecerli olup omaigini kontrol ediniz
        i) sekiz karakterden fazla ise ilk harf i olalidir
        ii) sekiz karakterden az ise ilk harf 'K olmali
         */

        String pwd = "i2a3ed54";

        char ilkHarf = pwd.charAt(0);

       String gecerli= pwd.length()<8 ? (ilkHarf=='K' ? "Gecerli" : "Gecersiz") : (ilkHarf=='i' ? "Gecerli" : "Gecersiz");

        System.out.println(gecerli);

        //lenght ; kac karakter oldugunu sayar

        //contains methodu bir ifade icinde istenen karakteri arar.




    }

}

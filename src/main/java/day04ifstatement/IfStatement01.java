package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {

        //If it rains I will cancel the picnic
        // sart dogru olursa calisir
        //yanlis olursa aktif olmayacak
        //piknigin iptal olmasi ,yagmurun yagmasina bagli
        //if statement belli kodlari belli sartlara bagli calisir

        //example 1;sayi pozitif ise ekrana pozitif yazdir
        int s = 123;

        if(s>12){
            System.out.println("positiuve");

        }

        //example 2 ;verilen karakter buyuk harf ise ekrana "Buyuk harf yaz"
        char ch ='A';
        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf");
            //sytmem kodu if e gore calisir.
        }

        // && islemi
        //cay && kahve getir
        //+  + = +    +  - = -   -  + = -    -   -  =  -  sadece hepsi  true oldugu durumda true olur
        // && islemi sadece boolean ile calisir.

        //Example 3; verilen sayi uc basamakli ise ekrana "uc basamakli " yazdir.
         int n =-123;
        n =Math.abs(n);
        if(n >99 && n<1000){
            System.out.println("uc basamakli");
        }

        //Example  4; Verilen bir sayi cift sayi ise ekrana cift sayi uyazdiriniz.cift ve tek islemlerinde  % yapilir
        int p =16;
        p = Math.abs(p);
        if(p%2== 0){
            System.out.println("cift sayi");

            //"=" isareti atama operatorudur, matematikteki esittir anlamina gelmez.
            //Matematikteki esittir sembolu Java'da "==" seklindedir
            //2+3  ==  5

        }

        //Example 5;verilen bir sayi 300 den kucuk veya 1200 den buyuk ise harika sayi yaz
        int r = 250;

        if(r<300 || r>1200){
            System.out.println("Harika sayi");
            // " bu isaret " veya anlamina gelir,sadece boolen ile kullanilir

            /* cay  veya  kahve ornegi veya ile
               +             +   =  + dogru
               +             -    = +  dogru
               -             +    = =  dogru
               -             -    = -  yanlis


             */

        }

    }
}

package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

    // Bir sayinin pozitif olup olmadigini kodu yazdiriniz

    //1,way: if else
    int a = 12;
    if(a>0) {
        System.out.println("pozitif");
    }else{
        System.out.println("pozitif egil");
    }


    //2,yol ;ternary

        String sonuc = a>0   ? "pozitif":"pozitif degil";
        System.out.println(sonuc);

      // example :Iki sayidan kucuk olani secen kodu yaziniz

      int b = 12;
      int c = 23;

      int min = b<c  ?  b  :  c;
      System.out.println(min);

        // cok sade bir kodla olayi cozuyoruz.

        // examole 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yazin
        // poztif sayilarla 0 in mutlak dgeri kendileridir,negatif sayilarin mutlak degeri -1 ile carpilmis halidir
        // abs ingilizce tam sayi demek

        int d = -45;

        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //Examole 4 : iki tane sayi ayni isaretli ise bu sayilari carpin ,farkli isaretli ise islem tapamam.ifadesi gorsun

        // Ternary farkli data turlerinde hata verirse mesela( int,,,,) dat tipini object yaziniz.
        // Her classin (Integer,String,Double...) ortak atsi Objecktir.farkli class turleriyle islem yapildiginda object secilmeli



        int e = 12;
        int f = 10;

        Object islem = ( e>0 && f>0 ) || ( e<0 && f<0) ? e*f : "islem yapaam";
        System.out.println(islem);

        //Note: Java da her class in en az bir tane 'parent(aile) classi vardir
        // Saece object class in Parent classsi yoktur cunku object tum klasslarin Atasidir.


    }

}

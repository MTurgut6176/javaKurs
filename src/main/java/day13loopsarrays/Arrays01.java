package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    /*
        1)Ayni data tipinde coklu datayi depolamak icin avaniin olusturdugu yapilar vardir.
          Bu yapilardan birisi de Array'lerdir.

     */

    public static void main(String[] args) {
        //Array nasil olusturulur?

        int stdAges[] = new int[7]; //[0,0,0,0,0,0,0]

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        //Arraylere elemanlar nasil eklenir?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));

        //Arrayde ki herhangi bir elemani nasil yazdirabliriz ?
        System.out.println(stdAges[4]);

        //Example 1: Arraydeki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz.

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));
        int ilk = stdAges[0];

        //Note:"length()" Stringlerde kullanilir. "length" Arraylarde kullanilir.
        int son = stdAges[stdAges.length - 1];

        System.out.println(ilk + son);//24

        //Example 2: stgAges Arrayi icindeki tum elemanlarin toplamini yazdiran kodu yaziniz.

        //1.yol

        int sum = 0;

        for (int i = 0; i < stdAges.length; i++) {
            sum = sum + stdAges[i];
        }
        System.out.print(sum);

        //2.yol


        int i = 0;
        int toplam = 0;

        while (i < stdAges.length) {

            toplam = toplam + stdAges[i];

            i++;
        }
        System.out.println(toplam);

        //3.yol
        int a = 1;
        int top = 0;

        do {
            top = a + top;
            a++;
        } while (a < stdAges.length);

        System.out.println(top);

        //4.yol: for each loop Arraylerde ve Collectionslarda kullanilir

        int t=0;
        for (int w :stdAges){
            t=t+w;
        }
        System.out.println(t);

        //Example 3 : String bir Array olusturunuz bu Array'a 5 tane isim yerlestiriniz
        //            Bu isimlerde ki character sayilarinin toplamini ekrana yazdiriniz.

        String stdNames[] = new String[5];
        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        int to =0;
        for(String w :stdNames ){
            to=to+w.length();
        }
        System.out.println(to);

        //Example 4:Char bi sayi olusturunuz
        //          Bu arraye 5 eleman ekleyiniz
        //          Bu arraydek, sadece buyuk harfleri ekrana yazdiriniz

        char ch[] = {'A', 'c', 'D', 'k', 'm'}; // kisa yol

        for(char w: ch)
        {
            if (w>= 'A' && w <= 'Z') {
                System.out.println(w);
            }
        }
    }
}
package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    /*
        ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.

        Array ile ArrayList'in farki nedir?
            1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
              Array'ler eleman sayisinda "fixed" dirler.
              ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
            2)Array'lerin icine "primitive" ve "reference" lar konabilir.
              ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
            3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
            Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
                  eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin

     */

    public static void main(String[] args) {

        //ArrayList nasil olusturulur?
        //1.Yol:
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.Yol:
        ArrayList<Integer> heights = new ArrayList<>();
        //3.Yol:
        List<Integer> nums = new ArrayList<>();


        //ArrayList'ler nasil yazdirilir?
        System.out.println(nums);// []

        //ArrayList'lere nasil eleman eklenir?
        //add() her zaman elemani en sona ekler. (insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);// [21, 18, 20]

        nums.add(1, 50);
        System.out.println(nums);// [21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);// [21, 50, 18, 20, 23, 185]
        System.out.println(prices);// [23, 185]

        nums.addAll(2, prices);
        System.out.println(nums);// [21, 50, 23, 185, 18, 20, 23, 185]


       // ArrayListlerin eleman sayisini bulma
        // Arraylerde lenght arraylistde size ile eleman sayisini buluruz
        int elemansyaisi1=nums.size();
        System.out.println("elemansyaisi1");

        //ArrayList de herhangi bir elemani alma

        int el1=nums.get(3);
        System.out.println(el1);//185

        // Arraylist in bos olup olmadigi
        boolean bos1=nums.isEmpty();
        System.out.println(bos1); // false

        boolean bos2=ages.isEmpty();  //True

        //Arraylist de bir eleman nasil degistirilir

        nums.set(3,200); // burada index 3 deki elemani al 200 yap
        System.out.println(nums);  //[21, 50, 23, 200, 18, 20, 23, 185]

        //soru .nums Array listeki tum tek  sayilari 11 artirdiktan sonra ekrana yazdiriniz
        //[21, 50, 23, 200, 18, 20, 23, 185]
        for(int w :nums){
            if(w%2!=0){
                nums.set(nums.indexOf(w), w+11);
            }

        }
        System.out.println(nums);//  [32, 50, 34, 200, 18, 20, 34, 196]

        // remove methodunu icine tam sayi koyarsaniz onu endex kabul eder


        // ArrayListen 200 elemanini siliniz
        //  onemli not Tum tam sayilar java icin primitiv yani int dir.
        // nemli not Primitivler Arraylist in elemani olamazlar
        // ama primitiv wrapper classa cevirirseniz non primitiv olur ve nbon primitivler Arraylistin elemani olurlar
        // birden fazla 200 varsa ilk buldugunu siler
        Integer sayi =200;
        nums.remove(sayi);
        System.out.println(nums); // burada 200 elemanini siler


    }

}
package day30collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {

        // hash bir tekniktir.hashing teknik derler
        // birbirine benzemeyen code ler  yaratir.Bu code ler data yi unique(benzersiz) yapar.
        // Set lere coklu ama tekrarsiz data depolamak istedigimizde ihtiyac duyariz(ogrenci numaralari gibi0
        // hashset ler siralama ile ugrasmaz,siralama ile zamn harcamaz hizli calisir
        // index kullanmazlar,cunku sirlama rastgele yapildigi icin index manali olmaz
       /*
       HashSetler:
        1)tekrarsiz elemanlarda
        2)sırlama onemli degilse
        3)hız cok önemliyse
        4)İndeks kullanmazlar    */

         HashSet<String > emails=new HashSet<>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");

        System.out.println(emails); //[Apple, Fig, Mango, Apricot, Orange]

        emails.add("Mango");
        System.out.println(emails); //[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[Null,Apple, Fig, Mango, Apricot, Orange]

        //Burada null null ustune yazdildigindan bir kere yazar





    }


}

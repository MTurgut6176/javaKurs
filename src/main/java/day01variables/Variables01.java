package day01variables;

public class Variables01 {
    //Variable nasil olusturulur?
    //1)Access modifier  2) Data type 3)variable ismi 4) = ısaretı koyacaksınız
    // 5) Deger  verilir  6)
    // (;) isareti kullanilir
    // "s" sembolu  Assigment atama anlamina gelir



    public int age = 13;

    public int height = 183;
                       //java da tipler
    /*
    Prıprimitiv datala
    1) int :Imteger in kisaltmasidir. 32 bit kullanir
    Matematikte tamsayilarin basi ve sonu yoktur.fakat java da tam sayilarin basi ve sonu yoktur
    En kucuk int;2147483648
    En buyuk int 2147483647  bunun nedeni memory icin yeni yerler acmasidir,baslangicin ve sonunun belli olmasidir.

    2) byt; tam sayilar icin kullanilir 8 bit
    en kck byte=-128
    en byk byte=127

public byte price = 12;

      3)short; tam sayilar  16 bit
            En kck short =-32768
             En byk short=32767

     4)Long Tamsayilar icindir  64 bit
     En kucuk long=-9223372036854755808
     En Buyul Long=

     5)floot; ondalikli sayilar icerir  32 bit kullanir

      virgulden sonra 7 basamak kullanir
      floot degerlerinde f koymak zorundasi yada F

      6)double;ondalikli sayilar icin  64 bit kullanir
      virgulden sonra 16 basamak icerir

      7) boolean:"true" veya "false" kullanir 1bit kullanir

      8) char:tek karakterler icin kullanir
      A,c,2, gibi bunlar tek tirnak arasina konur.
      Note;Numeric Data Types;byte<short<int<long<float<double
      Numeric olmayanlar data Types;boolean-char

     Non-Primate data Types farkalr
     1.Primitiv ile nNon primitiv turleri arasindaki en buyuk fark
     -non primitiv in yaninda mutlaka method vardir.Primitiv data typlerinde sadece deger vardir.

     2- primitiv data typleri java tarafindan olusturulurmethod yoktur.
     primitive data typleri saece 8 tanedir,biz primitiv data olusturamayiz
     non primitiv data typleriri sayilamayacak kadar coktur.herkesin yazdigi bir  non primitiv data typter

     3-Primitiv data typleri isimlendirilirken kucuk harlerle baslar
     Non primitiv data type isimleri buyuk harfle baslar.
     Non primitivler aslinda bir class dir .

     4-Primitiv dat typler memoryde kullandiklari alan farklidir
     Non-Primitive hepsi memoryde ayni buyuklukte yer kaplar

     String:Isim,adres,kimlik numarasi gibi cok fazla karakter varsa kullanilir,
     String degerleri mutlaka cift tirnak arasina konur
     String non-primitive dir,yani bir String olusturdugunuzda java size bir suru meod onerir
     */
    public byte prce =12;
      public short popilationdfVillage = 23000;

      public float priceOfShirt = 13.99F;
      public double weightOfCell = 0.00012845;public char initial;
    //Siz lONG DEMENIZE RAGMEN JAVA SAYIYI INT KABUL EDER
    public long populationOfWorld = 7000000000L;

    public long x=1234;

    public boolean isOld= true;
    public boolean isRich=false;

    public char inital ='S';
    public String name ="Tom Hanks";
     //;"main method" bu calismazsa hicbir sey calismaz
    public static void main(String[] args) {


    }

}

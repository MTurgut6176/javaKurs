package day18arraylistspassbyvalue;

public class PassByValue01 {
    /*
    1)Java variable nin orjinal degerlerini korumak ister .
    2) variable methodlar icinde kullanildiginda java methodun icine orjinal ,
    degerini koymaz ,kopya olusturur ve methoda kopyayi verir
    3)Method tum degisiklikleri yaparak orjinal degeri korur buna (pass by value ) denir.
    4) java pass by value kullanir
    5)bazi yazilim cesitleri ise orjinal degeri korumaz buna da pass by Refence denir
     */
    public static void main(String[] args) {

        int x=5;
        System.out.println(x);
        //Stattik metod olan main methodu icindeki her sey static olmali
        change (x);   // ogrenci gomlegi
        System.out.println(x); // ogrenci gomlegi
        int ucret =100;
        ucret=indirim(ucret);
        System.out.println("kopya");//90 verir kopyasi
        System.out.println(ucret); // bu yine 100 verir indirim yapmaz orjinal degeri korur
    }
      public static void change(int a){
          System.out.println(a*3);

    }
     // void disindaki "return" type lerde method badys icinde
    //"return" keyword kullanilmalidir
     public static int indirim(int gomlekUcreti){
        return gomlekUcreti-10;
     }
}

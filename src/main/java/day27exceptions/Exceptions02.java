package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    /*
        1) FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
       "new" den sonraki "FileInputStream" hata verir. Çünkü; biz Java'ya verilen adresteki dosyaya git dedik. Java
       iki endişeye kapıldı   i)Ya adres yanlışsa   ii)Ya verilen adreste dosya yoksa
       Biz "method isminden" sonra, "throws FileNotFoundException" yazarak Java'ya bu iki endişe duyduğun durum
       oluşursa "Exception At" dedik.

    2) while ((k = fis.read()) != -1){} yazdığımızda "read()" method'u hata verir. Çünkü biz Java'ya dosyadaki
       karakterleri oku dedik. Java bir endişeye kapıldı  i)Ya okuması gereken karakterler Java'nın bilmediği karakterler ise
       Biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karşılaştığında "Exception At" dedik.

    3) Method isminden sonra "throws IOException" yazarsanız Java "throws FileNotFoundException" ı siler. Çünkü;
       "IOException", "FileNotFoundException" ı kapsar. "IOException", "FileNotFoundException" ın parent'ıdır, onun yaptığı
       her şeyi yapabilir, o yüzden "IOException" varken "FileNotFoundException" a gerek yoktur.

       **IOException "Input Output Exception" demektir

        4) Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken, daha "Run" butonuna basmadan ortaya cikti.
            Bu tarz Exception'lara "Compile Time Exception" denir, diger adlari "Checked Exception" dir.

           "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling), halletmeden code yazmaya devam etmeyiniz.
     */

    public static void main(String[] args) throws IOException {

        readTheTextFromTheFile();
    }

    //Bir text file daki text i okuyan kodu yaziniz

    //1.Yol

    public static void readTheTextFromTheFile() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

        //obje olustururuz otomatik import eder

        int k = 0;

        while ((k = fis.read()) != -1) {

            System.out.print((char) k);
        }


    }

    //2.way
    public static void readTheText() {

        try {
            FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");

            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya'nin adresi veya varligi ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir karakter var");
        }

    }
}







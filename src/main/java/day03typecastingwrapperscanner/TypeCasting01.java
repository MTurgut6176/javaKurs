package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numarik data type ni diger numeric data type ne donusturmek demek
    // byte< short <int <long <floot <double   byte short shotu byte yapmak isteyebiliriz

    //kucukten buyuge yapilan islem:   Auto widening denir.    otomatik genisletme
    // buyukten kucuge yapilan isleme ise: Explicit Narowing     acikca daraltma denir

    public static void main(String[] args) {

         byte age = 23;
         int newAge = age;

         long population = 1234;

         int newPopulation = (int)population;

         //Example 1: short' double ceviren kodu yaziniz

      ; short numOfStudents = 235;
        double newNumOfStudents = numOfStudents;//Auto Widening


        //   Example 2:          floot'i byte yapan kodu yaziniz
        float price =12.99F;
        byte newPrice = (byte)price;//Explicit Norrawing

        System.out.println(newPrice);//12 ==> java ondalik sayiyi tam sayiya cevirirken yuvarlama yapmaz
                                               // java ondali kismi siler

        int number = 515;

        byte newNumber = (byte)number;

        System.out.println(newNumber);//3

        int num =510;

        byte newNum = (byte)num;

        System.out.println(newNum);//

    }
}

package day18arraylistspassbyvalue;

public class Varargs01 {
    /* Farkli sayilardaki parametrelerle calisabilen bir method kullanacaksaniz"varargs " kullaniriz
    2/varargs lar arkada Array kullanir,bu yuzden Arraylarle calisiyomusuz gibi davraniriz
    3/varargs olusturmak icin "<data tpe >...<varargs ismi>
    4/Bir methodda varargs in yaninda baska bir parametre kullanilabilir mi
    varargs en sonda olmak sartiyla kullanilabilir
    5/ Bie method birden fazla varagsla calismaz,cunku varrags en sonda olmak zorunda,o zmn biri en sonda olmayacaktir
     */
    public static void main(String[] args) {  // bu bir varargs dir

        int r1 = add(2,3);
        System.out.println(r1);  //5

        int r2 = add(2,3,4);
        System.out.println(r2); //9

        int r3 = add(8,9,9,7,6,4,7);
        System.out.println(r3);  //50 boylece cok kullanisli bir islem oluyor
    }
  /*
    // iki sayini toplamini return eden bir method olusturunuz
    public static int add(int a, int b) {       // add=toplama
        return a + b;
    }

    // uc sayinin toplamini veren methodu
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d) {    // 4 sayiyi topla bu isin sonu yok
        return a + b + c + d;
    } */
    //istedigimiz kadar sayiyi toplayabilen method
    public static int add(int... a){   // ... varargs anlamina gelir
       // string s basa yazarsak hata olmaz
        int sum =0;
        for(int w:a){
            sum=sum + w ;
        }
        return sum;

    }
}
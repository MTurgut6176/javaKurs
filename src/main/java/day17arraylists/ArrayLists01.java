package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);// [Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities);//removeAll() kullandiginizda sadece ilk list degisir, parantezin icindeki list degismez
        System.out.println(names);//[Thomas, Tahsin]
        System.out.println(cities);// [Trump, Tom, Taceddin]

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames);//Bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder.
        //Hepsi varsa true, en az biri yoksa false veriri
        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        //Example 1: "a" listinde "Shoes" elemaninin ilk gorunumunu siliniz
        a.remove("Shoes");
        System.out.println(a);

        //Example 1: "a" listinde "Shoes" elemaninin tum gorunumlerini siliniz
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]

        // soru bir tane salary(maas) listi olusturunu ,eger salary 10000 den az ise %20 10000 coksa %10 zam yapin

        List<Double> salary =new ArrayList<>();

        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);
        for(Double w : salary){

            if (w<10000){
                salary.set(salary.indexOf(w),w*1.2 );


            }else{
                salary.set(salary.indexOf(w),w*1.1 );
            }
        }

        System.out.println(salary);

        //soru iki Array in esit olup olmadigini kontrol eden kodu
        // iki Array listin esit olmasi icin elemanlar esit ve ayni elemanlar ayni indexte olmali
        //ilk bastan size ile eleman sayisina bkabiliriz

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.yol
        int counter =0;
        for (int i = 0; i < m.size(); i++) {
            if(m.size()!=n.size()){
                System.out.println("listeler esit degildir");
                break;
            }
            if(m.get(i) != n.get(i)){
                counter++;
                System.out.println("Listeler esit degildir");
                break;
            }
        } if(counter==0);

        System.out.println("listeler esittir");

       // 2.yol
       boolean esitmi = m.equals(n);
       if(esitmi){
           System.out.println("listeler esit");


       }else{
           System.out.println("listeler esit degil");
       }
    }

}
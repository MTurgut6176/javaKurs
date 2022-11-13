package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    public static void main(String[] args) {
        /*
        TreeSet tekrarsiz elemanlari 'alfabetik veya kucukten buyuge '(natural order)dizer.
        buyuzden cok yavas calisir

        Note: Tekrarsiz elemanlari natural order da depolamak icin TreeSet kullanmak mantiklidir
         ama TreeSet ler coook yavas calistigi icin biz,
      elemanlari once HashSet depolariz sonra HashSet'i TreeSet e cevirerek TreeSet in
      yavas olma problemini asmis oluruz.
         */

        //Example 1-Sekiz tane uniq String elemani alfabetik sirada depolayiniz.

        TreeSet<String> emails=new TreeSet<>();

       Long start1= LocalTime.now().toNanoOfDay();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");

        System.out.println(emails);
        Long end1=LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);//30100000

        //[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
       // alfabetik siraya soktu

        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");

        TreeSet myEmailsSorted=new TreeSet(myEmails); //HashSet i TreeSet e cevirmek icin bu kodu  yazdik
        System.out.println(myEmails);

        long end2=LocalTime.now().toNanoOfDay();
        System.out.println(end2-end1); //71000
    }
}

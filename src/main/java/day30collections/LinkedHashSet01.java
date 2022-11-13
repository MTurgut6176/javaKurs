package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {
        /*
        LinkedHashSet'ler elemanlari ekleme sirasina(insertion Order) gore yerlesirler'
        LinkedHashSet elemanlari siralamada zaman harcadigi icin HashSet'lere gor eyavas calisir.
         */

        LinkedHashSet<String> emails = new LinkedHashSet<>();
        emails.add("abc@gmail.com");
        emails.add("bca@gmail.com");
        emails.add("asc@gmail.com");
        emails.add("bde@gmail.com");
        emails.add("axy@gmail.com");

        System.out.println(emails);
    }
}

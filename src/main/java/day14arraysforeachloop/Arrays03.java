package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays03 {
    public static void main(String[] args) {
        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana" ==> calismayana

        /*once virgulden kurtul ve sonra parcala replaceall
        sonra cumleyi parcala,parcalamak icin split  ve bosluk kullan
        sonra coklu data icin Array gerekir,bunu sort edersen enkucuk basa enbuyuk sona gider
         */
        String sentence = "Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println(sentence);

        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        String words[] = sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(words));//[ne, ki, Java, kolay, kolaydir, calisana, calismayana]
        System.out.println(words[words.length-1]);//calismayana
    }
}

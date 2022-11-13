package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
        //Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        //Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int arr [] [] = { {2,5,1},{32,75},{50,60,70,80} };
        int sum =0;
        for(int[] w : arr){
            for(int k:w){
                sum=sum+k;
            }

        }
        System.out.println(sum);

        //soru2 Bir Multidiemensional array e ceviren kodu yaziniz
        // { {2, 5, 1}, {32, 75} } ==> { 2, 5, 1, 32, 75}
       // 1) Multidimensional Array deki eleman sayisini bulmaliyiz
      //  Cunku yeni bir array olusturmaliyiz ve bu yeni array in uzunlugu orijinal array in eleman sayisina esit olmalidir

       int brr[][] ={{ 2, 5, 1}, {32, 75}};

        int toplam = 0;
        for(int[] w : brr){
            toplam = toplam + w.length;


        }
        System.out.println(toplam);

        int idx =0;
                int crr[]=new int[toplam];
        for(int[] w :brr){
            for(int k :w){
                crr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));
    }



}

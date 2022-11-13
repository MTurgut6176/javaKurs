package day05ifstatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example; kullanici gun numarasini girsin kod gun ismini girsin
        //2.gun==>pazartesi

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz");

        System.out.println("Gun numarası girin...");

        byte gunNo=input.nextByte();

        if(gunNo==1){
            System.out.println("Pazar");
        } else if (gunNo==2) {
            System.out.println("Pazartesi");
        } else if (gunNo==3) {
            System.out.println("Sali");
        } else if (gunNo==4) {
            System.out.println("carsamba");
        } else if (gunNo==5) {
            System.out.println("Persembe");
        }
        else if (gunNo==6) {
            System.out.println("Cuma");
        }
        else if (gunNo==7) {
            System.out.println("Cumartesi");
        }
    }

}



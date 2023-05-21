package practice.day_03;

import java.util.Scanner;

public class C06_Ternary {

    //kullanıcıdan pozitif bir sayı alınız
    //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
    // ve yazdıran bir method olusturun
    public static void main(String[] args) {


 Scanner input = new Scanner(System.in);
        System.out.println("lutfen pozitif bir sayi giriniz");

        int sayi = Math.abs(input.nextInt());
        kacBasamakli(sayi);


    }

    public static void kacBasamakli(int sayi) {
        System.out.println(sayi>99 ? "sayı 3 basamakldir":"3 basamaklı degildir");
    }
}



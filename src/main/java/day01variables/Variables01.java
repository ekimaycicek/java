package day01variables;

public class Variables01 {


    public static void main(String[] args) {


        //java bu satiri okumaz,kendimize ve baskalarina aciklama satiridir.

        /*
        java bu satirlari okumaz
         */

        //Variable nasıl olusturulur?

        //Data type + variable name + Assignment Operator(atama operatoru) + Variable degeri+ noktali virgul

        int age = 13;

        //java cumlesi => statement
        //Dilbilgisindeki nokta ne ise javadaki ";" ayni seydir, yani statement'in bittigini gosterir.
        //Eger variable declaration yapar,Assignment yapmazsaniz java kendi default degerlerini koyar
        //Default deger sayilar icin sifirdir.
        //Java da "=" assignment operator'dir. ve java bu operatoru gordugu zaman once sag tarafi calistirir.
        //ve sagdaki degeri alir soldaki kutuya koyar
        //Java da esitir demek "=="        Matematikte"=",  Javada "=="
        //Data type + VariableName ==> Variable declariton
        //Assignment Operator (=) + Variabel degeri ==> Assignment

/*
        Javada temelde iki tip data vardir
            1)primitive data type:
                char, boolean, byte, short, int, long, float, double
            2)non-primitive data type:
                String
         */

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //Data type + variable name + Assignment Operator(atama operatoru) + Variable degeri+ noktali virgul
        String        ogrenciAdi              =                                 "Ali Can "            ;

        //String'lere verilen degerler daima cift tirnak icinde yazilmalidir
        //String'ler icin "default value"(==>varsayilan deger) "null" dir


        /*
        String bir variable olusturdugumuzda cogu zaman ona bir deger atariz. Atama yapmazsak, java o varibale'a
        varsayilan deger olarak null koyar
        -null demek 0 demek degildir, 0 da coding'te bir degerdir, null hiclik demektir.
        -icinde variable yada method bulunmayan bos bir obje demektir
         */

        //char data type
        //TEK karakterler icin kullanilir. Sayi, sembol yada harf farketmez
        //ornegin ==> A,x, ?, 5,...
        //Ornek 2: char data tipinde bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        char isminIlkHarfi = 'A' ;

        //Note: char data type'inda degerler daima tek tirnak icinde yazilmalidir

        //boolean data type:
        //boolean'lar sadece iki farkli deger alabilir; true (dogru) veya false(yanlis)
        //o yuzden isimlendirme yapilirken ingilize olarak mi? soru eki anlaminda basina is konulur.

        //Ornek 3: boolean data tipinde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.
        boolean isRetired = false;

        //byte data type
        //tam sayilar icin kullanilir, hafizada 1 byte yer kaplar
        //byte : -128 den +127 e (dahi) kadar tamsayi degerleri icin kullanilir

        //Ornek 4: byte data tipinde ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte ogrenciYasi = 18;

        //short data type
        //tam sayilar icin kullanilir, hafizada 2 byte yer kaplar
        //short : -32768 den +32767 e (dahil) kadar tamsayi degerleri icin kullanilir

        //Ornek 5: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 1300;

        //int data type
        //tam sayilar icin kullanilir, hafizada 4 byte yer kaplar
        //int : -2,147,483,648 ile 2,147,483,647 (dahil) kadar tamsayi degerleri icin kullanilir

        //Ornek 6: Ulke nufuslari icin bir variable olusturun ve deger atamasi yapiniz
        int ulkeNufusu = 131313131;

        //long data type:
        //tam sayilar icin kullanilir, hafizada 8 byte yer kaplar
        //long -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 (dahil) kadar tamsayi degerleri icin kullanilir

        //Ornek 7: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz

        //Note: Bir deger long ise sonuna "L"(tavsiye edilir) veya "l" konulur
        long cellNumberInHumanBody = 124546879545645461L;

        //Eger long a atadiginiz deger int'lerin araliginda ise sonuna "L" koymaya gerek yok
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder
        long weightOfSun = 1234561112;


        //float data type: 4 byte yer kaplar
        //float virgullu sayilar (Decimal Number => ondalikli sayilar) icin kullanilir(Fiyatlandirmalar - 12.99)

        //Ornek 8:  Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturun.

        //Java ondalikli sayilari otomatik olarak "double " kabul eder.
        //Siz data type'ini float yazarsaniz hata alirsiniz, float olmasinda israr ediyorsaniz sonuna "F","f" koymalisiniz
        float shirtPrice = 12.99F;
        float shoesPrice = 15.99f;

        //double data type: 8 byte yer kaplar
        //ondalikli kismi icin daha fazla rakam alabilir.  Hucre agirligi gibi bilimsel calismalarda kullanilabilir

        //Ornek 9: Hucre agirligi ve Amip in agirligi icin iki tane variable olusturunuz
        double weigthCell = 0.0000000000000013;
        double weifthAmip = 0.0000000000000003;

        //Ornek 10: Ogrenci notlari icin iki adet varibale olusturunuz ve toplamlarini ekrana yazdiriniz.
        byte note1 = 50;
        byte note2 = 70;
        System.out.print(note1);
        System.out.print(note2);

        //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar
        //System.out.print(); ekrana yazdirir ve pointer i ayni satirda tutar

        //homework
        /*
        1)3 farkli data turunda variable olusturun ve bunlari farkli satirlarda yazdirin
        2)ulke ve sehir isimleri icin iki variable olusturun ve bunlari yazdirin
        3) iki tamsayi turunde variable olusturup toplamini  yazdirin.
        */
        System.out.println();


        String isim = "Ekim";
        byte yas = 22;
        boolean kursAliyormu = true;

        String memleket = "Balikesir";
        String yasadigiSehir = "Balikesir";

        byte ayakkabiNumarasi = 39;
        int pcFiyat = 20000;
        System.out.println(ayakkabiNumarasi+pcFiyat);


        



    }



    }


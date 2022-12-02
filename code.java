package first;

import java.util.Scanner;

public class calculator {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz:");
        int counter = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayı:");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç:" + result);
    }

    static void times() {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int result = 1;
        int i = 1;
        while (true) {
            System.out.print(i++ + ".sayı:");
            number = scanner.nextInt();
            if (number == 1) {
                break;
            }
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç:" + result);
    }

    static void divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksin:");
        int counter = scanner.nextInt();
        double number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.println(i + ".sayı:");
            number = scanner.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Sıfıra bölünemez!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç:" + result);
    }
    static void power(){
        Scanner input = new Scanner(System.in);
        int result=1;
        System.out.print("Tabanı giriniz:");
        int base = input.nextInt();
        System.out.print("Üssü giriniz:");
        int exponent = input.nextInt();
        for(int i=1; i<=exponent;i++){
            result*=base;
        }
        System.out.println("Sonuç:"+result);
    }
    static void fac(){
        Scanner input = new Scanner(System.in);
        int result =1;
        System.out.print("Hangi sayının faktöriyelini almak istiyorsun:");
        int number= input.nextInt();
        for(int i=1;i<=number;i++){
            result*=i;
        }
        System.out.println("Sonuç:"+result);
    }
    static void mode(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int number = input.nextInt();
        System.out.print("Kaça göre modunu almak istiyorsun:");
        int number2 = input.nextInt();
        System.out.println("Sonuç:"+number%number2);

    }
    static void rectangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını giriniz:");
        int uk = input.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz:");
        int kk = input.nextInt();
        System.out.println("Alan:"+uk*kk);
        System.out.println("Çevre:"+(uk+kk)*2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        while (true) {
            System.out.println(menu);
            System.out.print("Hangi işlemi yapmak istiyorsunuz:");
            select = input.nextByte();
            if (select == 0) {
                System.out.println("Programdan çıkılıyor..");
                break;
            }
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    fac();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }
    }
}

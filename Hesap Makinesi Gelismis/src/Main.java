import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner imp = new Scanner(System.in);
        int number, result = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.print(i + ". sayı : ");
            number = imp.nextInt();
            result += number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner imp = new Scanner(System.in);
        int result = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.print(i + ". sayı : ");
            int number = imp.nextInt();
            if (i == 1) {
                result += number;
            } else {
                result -= number;
            }
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner imp = new Scanner(System.in);
        int result = 1;

        for (int i = 1; i <= 2; i++) {
            System.out.print(i + ". sayı : ");
            int number = imp.nextInt();
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner imp = new Scanner(System.in);
        double result = 0.0;

        for (int i = 1; i <= 2; i++) {
            System.out.print(i + ". sayı : ");
            double number = imp.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                i--;
                continue;
            }
            if (i == 1) {
                result = number;
            } else {
                result /= number;
            }
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner imp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int base = imp.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int exponent = imp.nextInt();

        int result = (int) Math.pow(base, exponent);

        System.out.println("Sonuç : " + result);
    }


    static void factorial() {
        Scanner imp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n = imp.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }


    static void modulus() {
        Scanner imp = new Scanner(System.in);
        int result = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.print(i + ". sayı : ");
            int number = imp.nextInt();
            if (i == 1) {
                result = number;
            } else {
                result %= number;
            }
        }

        System.out.println("Sonuç : " + result);
    }

    static void rectangle() {
        Scanner imp = new Scanner(System.in);
        int result = 1;

        for (int i = 1; i <= 2; i++) {
            System.out.print(i + ". sayı : ");
            int number = imp.nextInt();
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = imp.nextInt();
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
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}

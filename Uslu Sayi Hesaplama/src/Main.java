import java.util.Scanner;

public class Main {

    static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, k;

        System.out.print("Taban Sayısını Giriniz: ");
        n = inp.nextInt();

        System.out.print("Üs Olacak Sayıyı Giriniz: ");
        k = inp.nextInt();

        long sonuc = power(n, k);

        System.out.println(n + "^" + k + " = " + sonuc);
    }
}

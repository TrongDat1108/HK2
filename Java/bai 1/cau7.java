import java.util.Scanner;

public class cau7 {
    public static int tinhCau1(int n) {
        if (n == 0)
            return 0;
        else
            return n + tinhCau1(n - 1);
    }

    public static int tinhCau2(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * tinhCau2(n - 1);
    }

    public static int tinhCau3(int n) {
        if (n == 0)
            return 1;
        else
            return (2 * tinhCau3(n - 1));
    }

    public static float tinhCau4(int n) {
        if (n == 1)
            return 1;
        else
            return tinhCau4(n - 1) + 1 / (2 * n);
    }

    public static double tinhCau5(int n) {
        if (n == 1)
            return 1;
        else
            return tinhCau5(n - 1) + Math.pow(n, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap gia tri n: ");
        int n = input.nextInt();

        System.out.println("Ket qua cua cau 1 la: " + tinhCau1(n));
        System.out.println("Ket qua cua cau 2 la: " + tinhCau2(n));
        System.out.println("Ket qua cua cau 3 la: " + tinhCau3(n));
        System.out.println("Ket qua cua cau 4 la: " + tinhCau4(n));
        System.out.println("Ket qua cua cau 5 la: " + tinhCau5(n));
        input.close();
    }
}

import java.util.Scanner;

public class cau8 {
    public static void inChuDauVaChuCuoi(int x) {
        int tmp = 0, first;
        int temp = x;

        int last = temp % 10;
        while (x > 0) {
            tmp = x % 10;
            x = x / 10;
        }

        first = tmp;

        System.out.printf("So dau tien cua so nguyen vua nhap la: %d\n", +first);
        System.out.printf("So cuoi cung cua so nguyen vua nhap la: %d", +last);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so nguyen: ");
        int x = input.nextInt();

        inChuDauVaChuCuoi(x);

        input.close();
    }
}

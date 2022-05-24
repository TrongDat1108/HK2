import java.util.Scanner;

public class cau9 {
    public static void daoNguoc(int x) {
        int temp = 0;
        int index = 0;
        int buf = x;
        while (x > 0) {
            index = x % 10;
            temp = temp * 10 + index;
            x = x / 10;
        }
        if (temp == buf)
            System.out.printf("%d la so dao nguoc", buf);
        else
            System.out.printf("%d khong la so dao nguoc", buf);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so nguyen: ");
        int x = input.nextInt();

        daoNguoc(x);

        input.close();
    }
}

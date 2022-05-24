import java.util.Scanner;

public class cau10 {
    public static void dem(int n) {
        int count = 0;

        while (n > 1) {
            n = n / 10;
            count++;
        }

        System.out.printf("So luong chu so co trong mot so: %d\n", count + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so nguyen: ");
        int x = input.nextInt();

        dem(x);

        input.close();
    }
}

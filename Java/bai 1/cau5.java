import java.util.Scanner;

public class cau5 {
    public static void check(int x) {
        if (x % 2 == 0)
            System.out.printf("%d day la so chan", x);
        else
            System.out.printf("%d day la so le", x);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so nguyen: ");
        int x = input.nextInt();

        check(x);

        input.close();
    }
}
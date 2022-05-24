import java.util.Scanner;

public class cau3 {
    public static int check(int x) {
        if (x % 400 == 0)
            return 0;
        else if (x % 4 == 0 && x % 100 != 0)
            return 0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap nam can kiem tra: ");
        int n = input.nextInt();

        if (check(n) == 0)
            System.out.printf("%d la nam nhuan", +n);
        else
            System.out.printf("%d khong la nam nhuan", +n);

        input.close();
    }
}

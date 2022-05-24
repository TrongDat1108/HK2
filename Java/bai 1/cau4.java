import java.util.Scanner;

public class cau4 {
    public static int kiemTraHaiSo(int x, int y) {
        if (x < y)
            return y;
        else
            return x;
    }

    public static int kiemTraBaSo(int x, int y, int z) {
        if (x < y && y > z)
            return y;
        else if (x > y && x > z)
            return x;
        else
            return z;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao gia tri x: ");
        int x = input.nextInt();
        System.out.print("Nhap vao gia tri y: ");
        int y = input.nextInt();
        System.out.print("Nhap vao gia tri z: ");
        int z = input.nextInt();

        System.out.printf("So lon nhat trong hai so la %d\n", +kiemTraHaiSo(x, y));
        System.out.printf("So lon nhat torng ba so la: %d", +kiemTraBaSo(x, y, z));

        input.close();
    }
}

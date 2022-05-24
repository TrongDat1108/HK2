import java.util.Scanner;

public class cau6 {
    public static void check(char x) {
        if (x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z')
            System.out.println(x + " la ki tu trong bang chu cai");
        else
            System.out.println(x + " khong la ki tu trong bang chu cai");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao mot ki tu: ");
        char x = input.next().charAt(0);

        check(x);

        input.close();
    }
}

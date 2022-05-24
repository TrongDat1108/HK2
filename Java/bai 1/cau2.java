import java.util.Scanner;

public class cau2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap day cua tam giac: ");
        float day = input.nextFloat();

        System.out.println("Nhap chieu cau cua tam giac: ");
        float chieuCao = input.nextFloat();

        float S = (float) 0.5 * (day * chieuCao);

        System.out.printf("S = %f", +S);
        input.close();
    }
}

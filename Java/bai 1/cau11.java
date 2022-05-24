import java.util.Scanner;

public class cau11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----Menu----");
        System.out.println("1. Coca---2$");
        System.out.println("2. Pepsi--2$");
        System.out.println("3. Sprite-3$");
        System.out.println("4. Snack--2$");
        System.out.println("5. Shutdown Machine");

        System.out.println("Please enter the number: ");
        int x = input.nextInt();

        switch (x) {
            case 1:
                System.out.println("The price of Coca is: 2$, please enter the amount of money: ");
                float n = input.nextFloat();
                if (n == 2) {
                    System.out.println("The amount is enough, please receive the items below");
                } else if (n > 2) {
                    System.out.printf("Your change is " + (n - 2) + "$, please receive the items below");
                } else {
                    System.out.println("Not enough money to buy this item. Please select again");
                }
                break;

            case 2:
                System.out.println("The price of Pepsi is: 2$, please enter the amount of money: ");
                n = input.nextFloat();
                if (n == 2) {
                    System.out.println("The amount is enough, please receive the items below");
                } else if (n > 2) {
                    System.out.printf("Your change is " + (n - 2) + "$, please receive the items below");
                } else {
                    System.out.println("Not enough money to buy this item. Please select again");
                }
                break;

            case 3:
                System.out.println("The price of Sprite is: 3$, please enter the amount of money: ");
                n = input.nextFloat();
                if (n == 3) {
                    System.out.println("The amount is enough, please receive the items below");
                } else if (n > 3) {
                    System.out.println("Your change is " + (n - 3) + "$, please receive the items below");
                } else {
                    System.out.println("Not enough money to buy this item. Please select again");
                }
                break;

            case 4:
                System.out.println("The price of Snack is: 2$, please enter the amount of money: ");
                n = input.nextFloat();
                if (n == 2) {
                    System.out.println("The amount is enough, please receive the items below");
                } else if (n >= 2) {
                    System.out.printf("Your change is " + (n - 2) + "$, please receive the items below");
                } else {
                    System.out.println("Not enough money to buy this item. Please select again");
                }
                break;

            case 5:
                System.out.println("Machine is shutting down");

            default:
                if (x < 1 || x > 5) {
                    System.out.println("Please enter the valid number");
                }
                break;
        }
        input.close();
    }
}

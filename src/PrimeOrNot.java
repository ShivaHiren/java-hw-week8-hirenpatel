import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        System.out.println("Enter number to check: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        int lastDigit, sum = 0, a;
        Scanner as = new Scanner(System.in);
        System.out.println("Enter number to check palindrome or not ===");
        int inputNumber = as.nextInt();

        a = inputNumber;

        while (a > 0) {
            lastDigit = a % 10;
            sum = (sum * 10) + lastDigit;
            a = a / 10;
        }
        if (sum == inputNumber)
        {
            System.out.println(inputNumber + "==Number is Palindrome ");
        }else
        System.out.println(inputNumber + "== Number is not palindrome ");
    }
    }

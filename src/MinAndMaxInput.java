import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number (or press 0 to stop): ");
       int number = scanner.nextInt();
       int max = number;
       int min = number;
       while (number != 0) {
           if (number > max) {
               max = number;
           } else if (number < min) {
               min = number;
           }

           System.out.println("Type a number (or press 0 to stop)");
           number = scanner.nextInt();
       }
       if (max !=0 && min !=0) {
           System.out.println("Maximum is " + max);
           System.out.println("Minmum is " + min);
       }
}}
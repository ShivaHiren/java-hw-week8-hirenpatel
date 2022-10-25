
import java.util.Scanner;

public class Programme3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Alphabet");
        String input = scanner.next().toLowerCase();

        boolean uppercase = input.charAt(0) >=65 && input.charAt(0)<=90;
        boolean lowercase = input.charAt(0)>=97 && input.charAt(0)<=122;
        boolean vowels = input.equals("a") || input.equals("e")|| input.equals("i")||input.equals("o")||input.equals("u");

        if (input.length()>1){
            System.out.println("Not a single character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Not a letter, enter upper or lower case alphabet ");
        } else if (vowels) {
            System.out.println("Input letter in vowel");
        }
        else {
            System.out.println("Input letter is consonant");
        }
}}

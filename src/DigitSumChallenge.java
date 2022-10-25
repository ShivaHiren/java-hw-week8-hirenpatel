public class DigitSumChallenge {

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sumDigits = 0;
        String numberToString = Integer.toString(number);
        for (char c : numberToString.toCharArray()) {
            sumDigits += Integer.parseInt(String.valueOf(c));
        }
        return sumDigits;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 252 is = " + sumDigits(252));
        System.out.println("Sum of 257 is = " + sumDigits(257));
        System.out.println("Sum of 0 is = " + sumDigits(0));
        System.out.println("Sum of 5 is = " + sumDigits(5));
        System.out.println("Sum of -10 is = " + sumDigits(-10));

    }
}
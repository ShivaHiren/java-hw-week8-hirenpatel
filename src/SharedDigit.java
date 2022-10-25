public class SharedDigit {
    public static boolean hasShareDigit(int a, int b) {
        if (a <= 10 || a >= 99 || b <= 10 || b >= 99) {
            return false;
        }
        int leftA = a / 10;
        int leftB = b / 10;
        int rightA = a % 10;
        int rightB = b % 10;
        boolean ans = leftA == leftB || leftA == rightB || rightA == leftB || rightA == rightB;
        return ans;
    }
        public static void main (String[]args){
            System.out.println(hasShareDigit(12, 23));
            System.out.println(hasShareDigit(9, 99));
            System.out.println(hasShareDigit(15, 55));
        }
    }

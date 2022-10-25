

    import java.util.Scanner;
    public class RightAngleTriangle {
        public static void main(String[] args) {
            RightAngleTriangle  obj = new RightAngleTriangle();
            obj.logic();
        }
        public void logic() {
            int i, j, n;
            int rows = 5;
            Scanner sc = new Scanner(System.in);
            for (i = 1; i <= rows; i++) {
                System.out.println("");
                for (j = 1; j <= i; j++) {
                    System.out.print("@" + " ");
                }
            }
        }
    }


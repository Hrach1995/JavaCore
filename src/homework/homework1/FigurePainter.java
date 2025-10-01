package homework.homework1;

public class FigurePainter {
    public static void main(String[] args) {

        System.out.println("---1---");
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---2---");

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n - a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---3---");

        for (int x = 1; x <= n; x++) {
            for (int y = 0; y < n - x; y++) {
                System.out.print(" ");
            }
            for (int z = 0; z < x; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---4---");

        for (int k = 0; k <= n; k++) {
            for (int l = 0; l < k; l++) {
                System.out.print(" ");
            }
            for (int m = 0; m < n - k; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

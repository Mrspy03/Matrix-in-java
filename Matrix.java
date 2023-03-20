import java.util.Scanner;
import java.lang.*;

public class Matrix {
    public static void main(String args[]) {
        int r, c, /* array declaratio */ n[][], i, j;
        Scanner t = new Scanner(System.in);

        System.out.println("enter size of matrix =");
        r = t.nextInt();
        c = t.nextInt();
        // array creation
        n = new int[r][c];
        // for input
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.println("enter elements");
                n[i][j] = t.nextInt();
            }
        }
        // for displaying
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
import java.util.*;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("How many elements");
        int num = t.nextInt();
        int sum = 0;
        float avg = 0;

        int[] arr = new int[num];
        System.out.println("Enter element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = t.nextInt();
        }
        System.out.println("array is here");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            sum = sum + arr[i];
            avg = (float) sum / num;
        }
        System.out.println("sum is=" + sum + "\t" + avg);

    }
}

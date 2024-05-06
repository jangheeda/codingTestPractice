import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int idx = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < 9; i++) {
            if (arr[i] == max) {
                idx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(idx);


    }
}
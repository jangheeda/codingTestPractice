import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n * m > 0) {
            if (n > 0) {
                System.out.println("1");
            } else {
                System.out.println("3");
            }
        } else {
            if(n > 0) {
                System.out.println("4");
            } else {
                System.out.println("2");
            }
        }
    }
}
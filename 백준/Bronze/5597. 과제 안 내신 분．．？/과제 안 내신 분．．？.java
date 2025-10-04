import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] submit = new boolean[31];

        for(int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            submit[num] = true;
        }

        for(int i = 1; i <=30; i++) {
            if(!submit[i]) {
                System.out.println(i);
            }
        }
    }
}

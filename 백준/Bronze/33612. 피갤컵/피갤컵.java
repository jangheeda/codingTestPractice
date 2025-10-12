import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = 2024;
        int month = 8;
        int n = Integer.parseInt(br.readLine());

        if(n == 1) {
            System.out.println(year + " " + month);
        } else if (n >= 2) {
            n = (n - 1) * 7;
            month += n;
            if(month > 12) {
                year += (month - 1) / 12;
                month = (month - 1) % 12 + 1;
            }
            System.out.println(year + " " + month);
        }
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String score = st.nextToken();

        System.out.println(score.equals("A+") ? "4.3" :
                           score.equals("A0") ? "4.0" :
                           score.equals("A-") ? "3.7" :
                           score.equals("B+") ? "3.3" :
                           score.equals("B0") ? "3.0" :
                           score.equals("B-") ? "2.7" :
                           score.equals("C+") ? "2.3" :
                           score.equals("C0") ? "2.0" :
                           score.equals("C-") ? "1.7" :
                           score.equals("D+") ? "1.3" :
                           score.equals("D0") ? "1.0" :
                           score.equals("D-") ? "0.7" :
                           score.equals("F")  ? "0.0" : "");

    }
}

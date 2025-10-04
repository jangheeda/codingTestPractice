import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < count; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(n < num) {
               sb.append(n).append(' '); 
            }
        }
        System.out.println(sb.toString().trim());
    }
}

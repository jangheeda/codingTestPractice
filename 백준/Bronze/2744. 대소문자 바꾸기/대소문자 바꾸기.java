import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                ch += 32;
            } else if(ch >= 'a' && ch <= 'z') {
                ch -= 32;
            }
            str = str.substring(0, i) + ch + str.substring(i + 1);
        }
        System.out.println(str);
    }
}

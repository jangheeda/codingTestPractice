import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());

        

        while(x != 0) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            boolean ok = true;

            for(char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        ok = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) ok = false;

            System.out.println(ok ? "YES" : "NO");
            x--;
        }
        
    }
}
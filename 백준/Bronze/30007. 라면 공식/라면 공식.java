import java.util.*;
import java.io.*;

public class Main {
    public static int ramen(int coef, int water, int count) {
        return coef * (count - 1) + water;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        Queue<Integer> que = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int coef = Integer.parseInt(st.nextToken());
            int water = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            que.offer(ramen(coef, water, count));
        }
        
        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }
    }
}

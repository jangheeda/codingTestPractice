import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger n = new BigInteger(st.nextToken()); // 매우 큰 정수 OK
        BigInteger m = new BigInteger(st.nextToken()); // 1 ≤ m ≤ n

        StringBuilder out = new StringBuilder();
        out.append(n.divide(m)).append('\n');      // 몫
        out.append(n.remainder(m)).append('\n');   // 나머지

        System.out.print(out);
    }
}
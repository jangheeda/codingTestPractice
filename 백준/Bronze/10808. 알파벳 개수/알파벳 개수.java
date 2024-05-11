import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> alphabetCount = new HashMap<>();
        String s = br.readLine();

        // alphabetCount 초기화
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetCount.put(c, 0);
        }

        // 단어의 각 알파벳 개수 세기
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (alphabetCount.containsKey(currentChar)) {
                int count = alphabetCount.get(currentChar);
                alphabetCount.put(currentChar, count + 1);
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(alphabetCount.get(c) + " ");
        }
    }
}
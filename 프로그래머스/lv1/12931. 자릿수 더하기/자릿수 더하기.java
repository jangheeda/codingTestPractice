import java.util.stream.Stream;


public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        
      
        int[] digits = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i<digits.length;i++) {
        	answer += digits[i];
        }
        
       
        System.out.println("Hello Java");

        return answer;
    }
}

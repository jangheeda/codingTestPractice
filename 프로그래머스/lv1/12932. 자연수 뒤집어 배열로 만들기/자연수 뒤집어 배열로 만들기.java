import java.util.stream.Stream;

class Solution {
    public int[] solution(long n) {
        int[] answer = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        int temp = 0;
                
        for(int i = 0 ; i < answer.length/2;i++){
            temp = answer[i];
            answer[i] = answer[answer.length - i - 1];
            answer[answer.length - i - 1] = temp;
        }
        
        return answer;
    }
}
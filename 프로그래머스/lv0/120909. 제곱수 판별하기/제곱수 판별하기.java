class Solution {
    public int solution(int n) {
        int answer = 0;
        double num = 0;
        
        num = Math.sqrt(n) * 10;
        
        if(num % 10 == 0) {
        	answer = 1;
        }else {
        	answer = 2;
        }
        
        return answer;
    }
}
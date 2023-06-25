class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int num = n/slice;
        
        if(n % slice > 0) {
        	answer = num + 1;
        }else {
        	answer = num;
        }    
        return answer;
    }
}
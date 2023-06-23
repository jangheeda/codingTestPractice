import java.util.Arrays;

class Solution {
    public String solution(String my_string, int n) {
        char[] ans = my_string.toCharArray(), ans1 = new char[n];
        
        for(int i = 0;i < n;i++) {
        	ans1[i] = ans[i];
        }
        
        return String.valueOf(ans1);
    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String restr = my_string.replaceAll("[^0-9]", "");
        
        for(int i =0; i<restr.length();i++) {
        	answer += (restr.charAt(i)-'0');
        }
        
        return answer;
    }
}
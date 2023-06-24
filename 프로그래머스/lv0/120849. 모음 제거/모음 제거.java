class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] letter = {"a", "e", "i", "o", "u"};
        
        for(int i = 0; i < letter.length;i++) {
        	if(my_string.contains(letter[i])) {
        		answer = my_string.replaceAll(letter[i], "");
        		my_string = answer;
        	}else {
        		answer = my_string;
        	}
        }        
        
        return answer;
    }
}
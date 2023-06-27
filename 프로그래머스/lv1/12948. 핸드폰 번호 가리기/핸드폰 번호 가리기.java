import java.util.Arrays;


class Solution {
	public String solution(String phone_number) {
		String answer = "";
		char str[] = phone_number.toCharArray();
		
		
		for (int i = 0; i < phone_number.length()-4; i++) {
			str[i] = '*';
		}

		return answer = String.valueOf(str);
	}
}


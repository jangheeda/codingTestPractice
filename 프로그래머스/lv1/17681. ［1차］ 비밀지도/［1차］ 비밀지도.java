class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String[] barr2 = new String[n];
		String[] barr1 = new String[n];
		for (int i = 0; i < n; i++) {
			barr1[i] = integerToBinaryString(arr1[i], n);
			barr2[i] = integerToBinaryString(arr2[i], n);
		}
		for (int i = 0; i < n; i++) {
			answer[i] = compareAndMakeString(barr1[i], barr2[i]);
		}
		return answer;
	}
	
	String integerToBinaryString(int num, int n) {
		return String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(num)));
	}
	
	String compareAndMakeString(String a, String b) {
		String newStr = "";
		for (int i = 0; i < a.length(); ++i) {
			char aChar = a.charAt(i);
			char bChar = b.charAt(i);
			if (aChar == '0' && bChar == '0') {
				newStr += ' ';
			}else {
				newStr += '#';
			}
			
		}
		
	return newStr;
	}

}
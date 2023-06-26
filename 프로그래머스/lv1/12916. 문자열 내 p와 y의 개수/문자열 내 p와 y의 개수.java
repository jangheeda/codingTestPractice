class Solution {
	boolean solution(String s) {
		boolean answer = true;
		int ct1 = 0, ct2 = 0;
		;
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'y' || arr[i] == 'Y') {
				ct1++;
			}
			if (arr[i] == 'p' || arr[i] == 'P') {
				ct2++;
			}
		}
		if(ct1 == ct2) {
			answer = true;
		}else {
			answer = false;
		}

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("Hello Java");

		return answer;
	}
}
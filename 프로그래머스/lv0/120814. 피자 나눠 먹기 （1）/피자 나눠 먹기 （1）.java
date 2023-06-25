class Solution {
	public int solution(int n) {
		int answer = 0;
		double num = n % 7;
		if (num == 0) {
			answer = 1*(n/7);
		} else if (num > 0) {
			answer = (n / 7) + 1;
		}

		return answer;
	}
}


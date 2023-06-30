class Solution {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int smallValue = arr[0];
		
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] < smallValue) {
				smallValue = arr[i];
			}
		}
		

		if (arr.length <= 1) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[arr.length-1];
			for (int i = 0, j = 0; i < arr.length; i++) {
				if(arr[i] == smallValue) {
					continue;
				}
				answer[j] = arr[i];
				j++;
			}

		}

		return answer;
	}
}
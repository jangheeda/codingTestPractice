class Solution {
            public String solution(String s) {
                String answer = null;
                int idx = s.length()/2;
                char[] arr = s.toCharArray();

                if(s.length()%2 == 0){
                    answer = String.valueOf(arr[idx-1]) + String.valueOf(arr[idx]);
                }else {
                    answer = String.valueOf(arr[idx]);
                }
                return answer;
            }
}

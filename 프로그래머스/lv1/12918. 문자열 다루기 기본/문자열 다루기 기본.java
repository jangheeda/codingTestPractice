class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        
        
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        for (int i = 0; i < s.length(); ++i) {
            System.out.print(arr[i] + " ");
            if (arr[i] < '0' || arr[i] > '9') return false;
        }
        return true;
    }
}
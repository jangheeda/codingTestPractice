import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] answer = new String[a.length()];
        
        for(int i = 0; i < a.length(); i++) {
            
            if(Character.isUpperCase(a.charAt(i))) {
                answer[i] = String.valueOf(Character.toLowerCase(a.charAt(i)));
            } else {
                answer[i] = String.valueOf(Character.toUpperCase(a.charAt(i)));
            }
        }

        for (String str : answer) {
            System.out.print(str);
        }
    }
}
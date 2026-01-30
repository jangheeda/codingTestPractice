import java.io.*;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        int count = 0;

        for(int i = 0; i < a-1; i++) {
            count += month[i];
        }

        count += b-1;

        return week[count % 7];
    }
}
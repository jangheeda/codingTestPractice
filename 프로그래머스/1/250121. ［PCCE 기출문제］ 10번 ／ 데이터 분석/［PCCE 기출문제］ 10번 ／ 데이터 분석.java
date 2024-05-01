import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answerList = new ArrayList<>();
        int extNum = 0;
        int sortNum = 0;

        switch (ext) {
            case "code":
                extNum = 0;
                break;
            case "date":
                extNum = 1;
                break;
            case "maximum":
                extNum = 2;
                break;
            case "remain":
                extNum = 3;
                break;
        }
        switch (sort_by) {
            case "code":
                sortNum = 0;
                break;
            case "date":
                sortNum = 1;
                break;
            case "maximum":
                sortNum = 2;
                break;
            case "remain":
                sortNum = 3;
                break;
        }

        for(int i = 0; i < data.length; i++) {
            if(data[i][extNum] < val_ext) {
                answerList.add(data[i]);
            }
        }

        int[][] answer = answerList.toArray(new int[answerList.size()][]);
        final int sortNumFinal = sortNum; 

        Arrays.sort(answer, Comparator.comparingInt(arr -> arr[sortNumFinal]));

        return answer;
    }
}
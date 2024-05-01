class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        String color = board[h][w];
        
        int[][] directions = {{0, 1}, {-1, 0}, {1, 0}, {0, -1}};
        
        for (int[] dir : directions) {
            int mov_h = h + dir[0];
            int mov_w = w + dir[1];
            
            if((mov_h >= 0) && (mov_h < board.length) && (mov_w >= 0) && (mov_w < board.length)) {
                if(color.equals(board[mov_h][mov_w])) {
                    count++;
                }
            }
        }
        
        
        return count;
    }
}
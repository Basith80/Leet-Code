class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queens(board , 0);
    }

    
    static int queens(boolean[][] board , int row){
        if(board.length == row){
           return 1;
        }
        int count = 0;

        for(int col=0; col<board.length; col++){
            if(isSafe(board , row , col)){
                board[row][col] = true;
             count+=    queens(board , row+1);
                board[row][col] =  false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board , int row ,int col){
        //checking vertically
        for (int i=0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }

        // checking diagonal left
        int maxLeft = Math.min(row ,col);
        for (int i = 0; i <=maxLeft ; i++) {
            if (board[row-i][col-i]) return false;
        }

        //checking diagonal right
        int maxRight = Math.min(row,board.length-col-1);
        for (int i = 0; i <=maxRight ; i++) {
                if(board[row-i][col+i]) return false;
        }
        return true;

    }

}
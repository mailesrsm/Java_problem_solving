class Solution {
    public String tictactoe(int[][] moves) {
        char[][] board=new char[3][3];

        for(int i=0;i<moves.length;i++){
            
            int row=moves[i][0];
            int col=moves[i][1];

            if(i%2==0){
                board[row][col]='X';
            }
            else{
                board[row][col]='O';
            }
            char ch=board[row][col];

            if(board[row][0]==ch &&
               board[row][1]==ch &&
               board[row][2]==ch){
                return ch=='X' ? "A" : "B";
               }
            
            if(board[0][col]==ch &&
               board[1][col]==ch &&
               board[2][col]==ch){
                return ch=='X' ? "A" : "B";
               }
            
            if(row==col && 
               board[0][0]==ch &&
               board[1][1]==ch &&
               board[2][2]==ch){
                return ch=='X' ? "A" : "B";
               }

            if(row+col==2 &&
               board[0][2]==ch &&
               board[1][1]==ch &&
               board[2][0]==ch){
                return ch=='X' ? "A" : "B";
               }
        }
        if(moves.length==9){
            return "Draw";
        }
        return "Pending";
    }
}
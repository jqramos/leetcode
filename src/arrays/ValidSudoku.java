package arrays;

import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        //create a hashset to store the values
        HashSet<String> set = new HashSet<>();
        //loop through the rows
        for(int i = 0; i < board.length; i++){
            //loop through the columns
            for(int j = 0; j < board[0].length; j++){
                //if the current element is not empty
                if(board[i][j] != '.'){
                    //store the current element
                    String current = "(" + board[i][j] + ")";
                    //check if the current element is already present in the hashset
                    if(!set.add(current + i) || !set.add(j + current) || !set.add(i/3 + current + j/3)){
                        //if yes, return false
                        return false;
                    }
                }
            }
        }
        //return true
        return true;
    }
}

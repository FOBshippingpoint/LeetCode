import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        var set = new HashSet<String>();
        
        for (var i = 0; i < 9; i++) {
            for (var j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                
                var num = board[i][j];
                if (
                    !set.add(num + " in row " + i) ||
                    !set.add(num + " in col " + j) ||
                    !set.add(num + " in square " + i / 3 + '-' + j / 3)
                   )
                    return false;
            }
        }
        
        return true;
    }
}

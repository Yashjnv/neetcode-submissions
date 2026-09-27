class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] box = new HashSet[9];

        for(int i=0;i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                int boxNum = (i/3) * 3 + (j/3);
                char value = board[i][j];

                if (value == '.') {
                    continue;
                }
                if(!row[i].add(value) || !col[j].add(value) || !box[boxNum].add(value)){
                    return false;
                }

            }
        }
        return true;
    }
}

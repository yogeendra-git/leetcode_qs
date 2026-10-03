class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(num!='.'){
                    String row=num+"in row"+i;
                    String col=num+"in col"+j;
                    String box=num+"in box"+(i/3)+"_"+(j/3);

                    if(!s.add(row)||!s.add(col)||!s.add(box)){
                        return false;
                    }
                }
            }
        }return true;
    }
}
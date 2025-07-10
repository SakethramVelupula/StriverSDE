class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean zerofirstrow=false;
        boolean zerofirstcol=false;
        for(int r=0;r<row;r++){
            if(matrix[r][0]==0){
                zerofirstcol=true;
                break;
            }
        }
        for(int c=0;c<col;c++){
            if(matrix[0][c]==0){
                zerofirstrow=true;
                break;
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<row;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<col;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=1;j<col;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<row;i++){
                    matrix[i][j]=0;
                }
            }
        }
        if (zerofirstrow) {
            for (int c = 0; c < col; c++) {
                matrix[0][c] = 0;
            }
        }
        if (zerofirstcol) {
            for (int r = 0; r < row; r++) {
                matrix[r][0] = 0;
            }
        }
    }
}
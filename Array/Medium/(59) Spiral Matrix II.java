class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];

        int right=n-1;
        int left=0;

        int top=0;
        int bottom=n-1;

        int num=1;


        while(right>=left && top<=bottom){

            for(int i=left;i<=right;i++){
                matrix[top][i]=num++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                matrix[i][right]=num++;
            }
            right--;

            if (top<=bottom){
            for(int i=right;i>=left;i--){
                matrix[bottom][i]=num++;
            }
            bottom--;
            }

            if (right>=left){
            for(int i=bottom;i>=top;i--){
                matrix[i][left]=num++;
            }
            left++;
            }
            
        }
        return matrix;
    }
}

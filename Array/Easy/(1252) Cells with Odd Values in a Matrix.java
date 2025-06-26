class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int count=0;
        int[][] matrix=new int[m][n];

        for(int[] arr:indices){
            int row=arr[0];
            int col=arr[1];

            for(int j=0;j<n;j++){
                matrix[row][j]+=1;
            }

            for(int i=0;i<m;i++){
                matrix[i][col]+=1;
            }
        }
        for(int[] arr1:matrix){
            for(int value:arr1){
                if (value%2==1)
                count++;
                }
            }
        
        return count;
    }
}

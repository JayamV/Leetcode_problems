class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int[][] temp=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=image[i][n-j-1];
                if (temp[i][j]==0){
                    temp[i][j]=1;
                }else{
                    temp[i][j]=0;
                }
            }
        }
        return temp;
        
    }
}

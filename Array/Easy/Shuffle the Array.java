class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] temp=new int[n*2];
        for (int i=0;i<n;i++){
            temp[2*i]=nums[i];
            temp[2*i+1]=nums[i+n];
        }
        return temp;       
    }
}

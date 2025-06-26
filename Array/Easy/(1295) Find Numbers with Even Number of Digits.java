class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for (int x:nums){
            if (countN(x)%2==0){
                count++;
            }
        } 
        return count;
    }

    int countN(int a){
        int z=0;
        while(a>0){
            z++;
            a=a/10;
        }
        return z;
    }
}

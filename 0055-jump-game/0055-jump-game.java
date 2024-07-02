class Solution {
    public boolean canJump(int[] nums) {
        int finalNum = nums.length-1;

        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=finalNum){
                finalNum=i;
            }
        }
        return finalNum==0;
    }
}
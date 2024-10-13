class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int oneCount=0;
        int maxCount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                oneCount++;
                maxCount=Math.max(maxCount,oneCount);
            }
            else{
                oneCount=0;
            }

        }
        return maxCount;
       
    }
}
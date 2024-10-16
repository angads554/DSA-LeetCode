class Solution {
    public int majorityElement(int[] nums) {
        int vote=0,majEle=0;
        for(int i=0;i<nums.length;i++)
        {
            if(vote==0){
                majEle=nums[i];
        }
        if(nums[i]==majEle){
            vote++;
        }else{
            vote--;
        }
        }
        return majEle;
    }
}
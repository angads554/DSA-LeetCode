class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] temp = new int[nums.length];
        int maxIndex = 0;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(temp[j]+1>temp[i]){
                        temp[i]=temp[j]+1;
                    }
                }
            }
        }

        for(int i=0;i<temp.length;i++){
            if(temp[i]>temp[maxIndex]){
                maxIndex=i;
            }
        }

        return temp[maxIndex]+1;
    }
}
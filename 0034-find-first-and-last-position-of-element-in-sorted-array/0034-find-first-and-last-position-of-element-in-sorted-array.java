class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            {
            arr[0]=i;
            break;   
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                arr[1]=j;
                break;
            }
        }

        return arr;
    }
}
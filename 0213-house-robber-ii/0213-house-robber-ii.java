class Solution {

    private int helper(int[] nums){
        
         if(nums.length<2){
            return nums[0];
        }
        int[] arr = new int[nums.length];

        arr[0]=nums[0];
        arr[1]= Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            arr[i]=Math.max(arr[i-2]+nums[i],arr[i-1]);
        }

        return arr[nums.length-1];
    }

    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }

        int[] skipLastHouse = new int[nums.length-1];
        int[] skipFirstHouse = new int[nums.length-1];

        for(int i=0;i<nums.length-1;i++){
            skipLastHouse[i]=nums[i];
            skipFirstHouse[i]=nums[i+1];
        } 

        int last = helper(skipLastHouse);
        int first = helper(skipFirstHouse);

        return Math.max(last,first);





    }
}
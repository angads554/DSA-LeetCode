class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength=0;
        HashMap<Integer, Boolean> newArr= new HashMap<>(nums.length);

        for(int i=0;i<nums.length;i++){
            newArr.put(nums[i],false);
        }

        for(int num:nums){
            int curentLength=1;
            int nextNums=num+1;
            while(newArr.containsKey(nextNums)&&newArr.get(nextNums)==false){
                curentLength++;
                newArr.put(nextNums,Boolean.TRUE);
                nextNums++;
            }

            int previousNums=num-1;
            while(newArr.containsKey(previousNums)&&newArr.get(previousNums)==false){
                curentLength++;
                newArr.put(previousNums,Boolean.TRUE);
                previousNums--;
            }
            longestLength=Math.max(longestLength,curentLength);
        }
return longestLength;

        
    }
}
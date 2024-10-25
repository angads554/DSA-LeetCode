class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h1= new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int com = target-nums[i];
            if(h1.containsKey(com)){
                return new int[]{h1.get(com),i};
            }
            h1.put(nums[i],i);
        }
        return nums;
    }
}
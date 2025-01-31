class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backTrack(result, new ArrayList<>(), nums,0); 
        return result;
    }
    private void backTrack(List<List<Integer>> result, List<Integer> tempSet, int[] nums, int start){
        result.add(new ArrayList<>(tempSet));
        for(int i= start;i<nums.length;i++){
            tempSet.add(nums[i]);

            backTrack(result, tempSet, nums, i+1);

            tempSet.remove(tempSet.size()-1);
        }
    }
}
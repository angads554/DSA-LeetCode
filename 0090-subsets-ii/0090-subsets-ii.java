class Solution {

    public void help(List<List<Integer>>ans, List<Integer> tempSet, int[]nums, int start){
        if(start==nums.length){
            ans.add(new ArrayList<>(tempSet));
            return;
        }
        tempSet.add(nums[start]);
        help(ans,tempSet,nums,start+1);
        tempSet.remove(tempSet.size()-1);

        int idx=start+1;

        while(idx< nums.length && nums[idx]==nums[idx-1]) idx++;
         help(ans,tempSet,nums,idx);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        help(ans, new ArrayList<>(),nums,0);
        
        return ans;
        
    }
}
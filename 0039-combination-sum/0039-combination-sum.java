class Solution {
    public void help(List<List<Integer>> ans, List<Integer> tempSet, int[] arr, int target, int index){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(tempSet));
                
            }
            return;
        }
        if(target>0){
            tempSet.add(arr[index]);
            help(ans,tempSet, arr,target-arr[index],index);
            tempSet.remove(tempSet.size()-1);
        }
        help(ans,tempSet, arr,target,index+1);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        help(ans, new ArrayList<Integer>() ,candidates,target, 0);
        return ans;
    }
}
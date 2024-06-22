class Solution {

    private void helper(int index, int target, int[] candidates,  List<List<Integer>> arr,List<Integer> ds)
    {
        if(index==candidates.length){
            if(target==0){
                arr.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[index]<=target){
            ds.add(candidates[index]);
            helper(index, target-candidates[index],candidates,arr, ds);
            ds.remove(ds.size()-1);
        }
         helper(index+1, target,candidates,arr, ds);
    }

    




    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ar = new ArrayList<>();
        helper(0,target, candidates, ar, new ArrayList<>());
        return ar;
    }

}
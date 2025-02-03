class Solution {
      public void help(List<List<Integer>> ans, List<Integer> tempSet, int[] arr, int target, int index){
       
            if(target==0){
                ans.add(new ArrayList<>(tempSet));
                return;
            }
            for(int i=index;i<arr.length;i++){
                if(i>index && arr[i]==arr[i-1]) continue;
                if(arr[i]>target) break;

                tempSet.add(arr[i]);
                help(ans,tempSet,arr,target-arr[i],i+1);
                tempSet.remove(tempSet.size()-1);
            }
      }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(candidates);
        help(ans, new ArrayList<Integer>() ,candidates,target, 0);
        return ans;
    }
}
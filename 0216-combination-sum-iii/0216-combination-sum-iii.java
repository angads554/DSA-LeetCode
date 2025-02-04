class Solution {
    public void help(List<List<Integer>> ans, List<Integer> tempSet, int k,int n, int ind){
        if(n==0 && k==0){
            ans.add(new ArrayList<>(tempSet));
            return;
        }
        for(int i=ind;i<=9;i++){
            if(n==0 && k==0){
                return;
            }
            tempSet.add(i);
            help(ans, tempSet,k-1,n-i,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        help(ans, new ArrayList<>(), k,n,1);
        return ans;
    }
}
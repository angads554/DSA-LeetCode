class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> ar = new ArrayList<>();
           for(int j=0;j<=i;j++){
            if(j==0||j==i){
                ar.add(1);
            }
            else{
                ar.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
           
           } ans.add(ar);
        }

        return ans;
        
    }
}
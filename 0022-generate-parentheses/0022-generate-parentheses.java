class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans= new ArrayList<>();
        rec(ans,n,0,0,"");
        return ans;
    }

    public void rec(List<String> ans, int n, int open, int close, String currStr){
        if(currStr.length()==n*2){
            ans.add(currStr);
            return;
        }
        if(open<n){ rec(ans,n,open+1,close,currStr+"("); }
        if(close<open){ rec(ans,n,open,close+1,currStr+")"); }

    }
}
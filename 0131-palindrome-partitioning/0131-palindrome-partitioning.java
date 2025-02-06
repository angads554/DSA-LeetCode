class Solution {

    private boolean pali(String s){
        String s2= "";

        for(int i=s.length()-1;i>=0;i--){
            s2+=s.charAt(i);
        }

        return s.equals(s2);
    }

    private void help(List<List<String>> ans ,String s, List<String> tempSet){
       if(s.length()==0){
        ans.add(new ArrayList (tempSet));
        return;
       }
        for(int i=0;i<s.length();i++){
            String part= s.substring(0,i+1);

            if(pali(part)){
                tempSet.add(part);
                help(ans,s.substring(i+1),tempSet);
                tempSet.remove(tempSet.size()-1);
            }

        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        help(ans,s, new ArrayList<>());
        return ans;
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
      
        List<String> ans= new ArrayList<>();
         if(digits.length()==0){
            return ans;
        }
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index=0;
        String output="";

        help(digits,mapping, index,ans,output);

        return ans;

    }

     private void help(String digits, String[] mapping, int index, List<String> ans, String output){
        if(index>=digits.length()){
            ans.add(output);
            return;
        }

        int digit=digits.charAt(index)-'0';
        String value = mapping[digit];

        for (int i = 0; i < value.length(); i++) {
            help(digits, mapping, index + 1, ans, output + value.charAt(i));
        }
    

     }
}
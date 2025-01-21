class Solution {
    public String removeOuterParentheses(String s) {
        Stack <Character> stk = new Stack<>();
        ArrayList<Integer> ar = new ArrayList<>();
        char[] str = s.toCharArray();

        for(int i=0;i<str.length;i++){
            if(stk.size()==0) {
                stk.push(str[i]);
                ar.add(i);
                continue;
            }
            if(str[i]=='('&& stk.peek()==')')
            {
                stk.pop();
                if(stk.size()==0){
                    ar.add(i);
                }
            }
            if(str[i]==')'&&stk.peek()=='('){
                stk.pop();
                if(stk.size()==0){
                   ar.add(i);
                }
            }
            else{
                stk.push(str[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int j=0;j<ar.size();j+=2){
            sb.append(s.substring(ar.get(j)+1,ar.get(j+1)));
        } 
        return sb.toString();
    }
}
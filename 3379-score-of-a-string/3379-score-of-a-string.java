class Solution {
    public int scoreOfString(String s) {
        int temp=0;

        for(int i=0;i<s.length()-1;i++){
            temp+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return temp;
        
    }
}
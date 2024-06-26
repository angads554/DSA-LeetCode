class Solution {
    public int numDecodings(String s) {
        int[] ar = new int[s.length()+1];
        ar[0]=1;
        ar[1]= s.charAt(0)=='0' ? 0:1;

        for(int i=2;i<=s.length();i++){
            int singleDigit=Integer.valueOf(s.substring(i-1,i));
            int doubleDigit= Integer.valueOf(s.substring(i-2,i));

            if(singleDigit>=1){
                ar[i]+=ar[i-1];
            }
            if(doubleDigit>=10 && doubleDigit<=26){
                ar[i]+=ar[i-2];
            }
        }
        return ar[s.length()];
    }
}
class Solution {
    public int divide(int dividend, int divisor) {
        boolean sign = true;
        if(dividend==divisor) return 1;
        if(dividend>=0 && divisor<0) sign = false;
        if(dividend<0 && divisor>0) sign = false;

        long n= Math.abs((long) dividend);
        long d= Math.abs((long) divisor);

        long ans=0;

        while(n>=d){
            int cnt =0;
            while(n>=(d<<cnt+1)&&(d<<(cnt+1))>0){
                cnt++;
            }
            ans+= 1L<<cnt;
            n-=d<<cnt;
        }
if (sign && ans >= (1L << 31)) return Integer.MAX_VALUE;
        if (!sign && ans >= (1L << 31)) return Integer.MIN_VALUE;
        return sign ? (int) ans : (int) - ans;
    }
}
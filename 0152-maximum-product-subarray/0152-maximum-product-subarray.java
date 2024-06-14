class Solution {
    public int maxProduct(int[] nums) {
        int leftProduct=1;
        double rightProduct=1;
        double ans= nums[0];
        for(int i=0;i<nums.length;i++){
           
            leftProduct*=(double)nums[i];
            rightProduct*=(double)nums[nums.length-1-i];
            ans=Math.max(ans,Math.max(leftProduct,rightProduct));

            if(leftProduct==0){
                leftProduct=1;
            }
            if(rightProduct==0){
                rightProduct=1;
            }
        }
        return (int) ans;
    }
}
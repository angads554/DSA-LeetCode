class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1, high =Integer.MIN_VALUE;
        for(int n: nums){
            high=Math.max(high,n);
        }
        
        while(low<=high){
            int mid = (low+high)/2;
            int sum=0;
            for(int num: nums){
                 sum += (num + mid - 1) / mid;
            }
           
            if(sum>threshold){
                low=mid+1;
            }
            else{
                
                high=mid-1;
            }
        }
        return low;
    }
}
class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int ans=0;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }
        while(low<=high){
            int mid=(low+high)/2;
            int count = isPossible(nums,mid);
            if(count<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;

            }
        }
        return ans;
    }
    private int isPossible(int[] arr, int m){
        int count=0;
        int tempSum=0;
        for(int i=0;i<arr.length;i++){
            if(tempSum+arr[i]<=m){
                tempSum+=arr[i];
            }
            else{
                count++;
                tempSum=arr[i];
            }   
        }
        count++;
        return count;
    }
}
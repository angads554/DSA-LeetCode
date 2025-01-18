class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m*k;
        if(bloomDay.length<val) return -1;

        int low=Integer.MAX_VALUE, high = 0;
        int ans =0;

        for(int bDay : bloomDay){
            low=Math.min(low,bDay);
            high=Math.max(high, bDay);
        }

        while(low<=high){

            int mid =(low+high)/2;
            if(possible(bloomDay,mid, m,k)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean possible (int[]arr , int mid, int m, int k){
        int count=0;
        int noOfBou=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }
            else{
                noOfBou+=(count/k);
                count=0;
            }
        }
         noOfBou+=(count/k);
        if(noOfBou>=m)return true;
        else return false;
    }
}
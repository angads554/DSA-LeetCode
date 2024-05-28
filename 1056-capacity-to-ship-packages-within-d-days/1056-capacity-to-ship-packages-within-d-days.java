class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        int ret=0;
        for(int i=0;i<weights.length;i++){
            high+=weights[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(capacity(weights,mid,days)){
                ret=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ret;
       
    }
 public boolean capacity(int[] weights,int mid,int days){
    int d=1;
    int w=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>mid||d>days){
                return false;
            }
            else if(w+weights[i]>mid){
                w=weights[i];
                d++;
            }
            else{
                w+=weights[i];
            }
        }
        return d<=days;
        }
    
}
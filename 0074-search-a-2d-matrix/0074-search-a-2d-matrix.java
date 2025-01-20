class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      for(int i=0;i<matrix.length;i++){
        if(bSearch(matrix[i],target)){
            return true;
        }
      }
      return false;
    }

    private boolean bSearch(int[] mat,int target){
        int low= 0;
        int high= mat.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mat[mid]==target){
                return true;
            }
            else if(mat[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
      
    
}
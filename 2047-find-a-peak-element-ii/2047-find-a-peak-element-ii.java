class Solution {
    private int maxEle(int[][] mat, int n, int m, int mid){
        int maxVal=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][mid]>maxVal){
                maxVal = mat[i][mid];
                index=i;
            }
        }
        return index;
    } 

    public int[] findPeakGrid(int[][] mat) {
        int n= mat.length;
        int m= mat[0].length;
        int low = 0;
        int high = m-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = maxEle(mat,n,m, mid);
            int l= mid-1>=0 ? mat[row][mid-1]:-1;
            int r= mid+1<m ? mat[row][mid+1]:-1;
            if(mat[row][mid]>l && mat[row][mid]>r){
                return new int[] {row,mid};
            }
            else if(mat[row][mid]<l){
                high= mid-1;
            }
            else{
                low= mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}
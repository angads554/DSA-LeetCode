class Solution {

    private boolean safe(List<List<String>> ans,List<String> tempSet, int n, int row, int col){
        for(int j=0;j<n;j++){
            if(tempSet.get(row).charAt(j)=='Q'){
                return false;
            }
        }
        for(int i=0;i<n;i++){
            if(tempSet.get(i).charAt(col)=='Q'){
                return false;
            }
        }

        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(tempSet.get(i).charAt(j)=='Q'){
                return false;
            }
        }
         for(int i=row,j=col;i>=0&&j<n;i--,j++){
            if(tempSet.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        return true;
    }

    private void nQueen(List<List<String>> ans, List<String> tempSet, int n, int row) {
        if (row == n) {
            ans.add(new ArrayList<>(tempSet));
            return ;
        }
        for (int j = 0; j < n; j++) {
            if (safe(ans, tempSet, n, row, j)) {
              StringBuilder sb = new StringBuilder(tempSet.get(row));
            sb.setCharAt(j, 'Q');
            tempSet.set(row, sb.toString());
                nQueen(ans, tempSet, n, row + 1);
                sb.setCharAt(j, '.');
            tempSet.set(row, sb.toString());
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> tempSet = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tempSet.add(".".repeat(n));
        }
        nQueen(ans, tempSet, n, 0);
        return ans;
    }
}
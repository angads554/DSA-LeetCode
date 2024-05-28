class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i=nums.length-1;i>=0;i--){
            int temp=nums[i];
            while(temp>0){
                int digit = temp%10;
                ar.add(digit);
                temp=temp/10;
            }
        }
        int arr[] = new int[ar.size()];
        System.out.println(ar);
        int j=0;
        for(int i=ar.size()-1;i>=0;i--){
            arr[j++]=ar.get(i);
            //j++;
        }


        return arr;
        
    }
}
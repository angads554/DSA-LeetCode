class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            long hours = 0;

            for (int pil : piles) {
                hours += (pil + mid - 1L) / mid;
            }
            if (hours <= h) 
            {
                high = mid-1;
            } 
            else {
                low = mid + 1;
            }
        }

        return low;
    }
}
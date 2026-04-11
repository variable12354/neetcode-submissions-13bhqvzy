class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right  = 0;

        for(int pile: piles){
            right = Math.max(right,pile);
        }

        while(left < right){
            int mid = left + (right - left) / 2;
            if(isEaten(piles,mid,h)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean isEaten(int[] piles,int k,int h){
        int hours = 0;
        for(int pile:piles){
            hours += Math.ceil((double) pile/k);
        }
        return hours <= h;
    }
}

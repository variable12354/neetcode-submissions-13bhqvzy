class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        int longest = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num:nums){
            set.add(num);
        }

        for(int i:set){
            if(!set.contains(i-1)){

                int currentNum = i;
                int currentIndex = 1;

                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentIndex++;
                }

                longest = Math.max(longest,currentIndex);

            }

        }
        return longest;
    }
}

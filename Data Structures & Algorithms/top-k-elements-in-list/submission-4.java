class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b)
        );

        for(int ele:map.keySet()){
            pq.offer(ele);
            if(pq.size() > k){
                pq.remove();
            }
        }

        int[] result = new int[k];
        int index = 0;
        while(!pq.isEmpty()){
            result[index++] = pq.remove();
        }
        return result;
    }
}

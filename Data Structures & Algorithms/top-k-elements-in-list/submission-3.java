class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->
            map.get(a) - map.get(b)
        );

        for(int freq:map.keySet()){
            pq.offer(freq);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] result = new int[k];
        int index = 0;
        while(!pq.isEmpty()){
            result[index++] = pq.poll();
        }

        return result;
    }
}

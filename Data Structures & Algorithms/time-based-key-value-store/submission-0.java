class TimeMap {

    class Pair {
        String value;
        int timeStemp;
         Pair(int time, String value) {
            this.timeStemp = time;
            this.value = value;
        }
    }
    Map<String,List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));
    
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair> list = map.get(key);
        int left = 0;
        String result = "";
        int right = list.size() - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
          
             if(list.get(mid).timeStemp == timestamp) {
                return list.get(mid).value;
             }
             
             if(list.get(mid).timeStemp < timestamp){
                   result = list.get(mid).value;
                left = mid + 1;
                
             }else{
             right = mid - 1;
             }
        }
       return result;
    }
}

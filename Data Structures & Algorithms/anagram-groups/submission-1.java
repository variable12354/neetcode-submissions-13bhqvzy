class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            int[] freqArray = new int[26];
            char[] strChar = str.toCharArray();
            for(char ch:strChar){
                freqArray[ch - 'a']++;
            }
            String freqStr = Arrays.toString(freqArray);
            if(!map.containsKey(freqStr)){
                map.put(freqStr,new ArrayList<>());
            }

            map.get(freqStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

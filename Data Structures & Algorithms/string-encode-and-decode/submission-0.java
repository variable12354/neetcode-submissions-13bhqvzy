class Solution {

    public String encode(List<String> strs) {
        StringBuilder newStr = new StringBuilder();
        for(String s:strs){
            newStr.append(s.length())
                .append("#")
                .append(s);    
        }

        return newStr.toString();

    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> newStrs = new ArrayList<>();
        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));

            j++;
            String part = str.substring(j,j+length);

            newStrs.add(part);
            i = j + length;
        }
        return newStrs;
    }
}

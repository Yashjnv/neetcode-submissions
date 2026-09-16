class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str :strs){
            int len = str.length();
            sb.append(len);
            sb.append('#');
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int start = 0;
        int len = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                len = Integer.parseInt(str.substring(start, i));
                String word = str.substring(i + 1, i + 1 + len);
                result.add(word);
                start = i+1+len;
                i=start-1;
            }
        }
        return result;
    }
}

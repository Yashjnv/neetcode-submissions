class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);


            if(map.containsKey(sorted)){
                map.get(sorted).add(str);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted,list);
            }

            
        }
        List<List<String>> result = new ArrayList<>();

        for(List<String> str : map.values()){
            result.add(str);
        }

        return result;
    }    
}

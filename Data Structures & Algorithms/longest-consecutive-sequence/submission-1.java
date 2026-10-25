class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int result = 1;
        if(nums.length<1){
            return 0;
        }
        for(int num:nums){
            seen.add(num);
        }
        for(int num:seen){
            int tempResult = 1;
            if(!seen.contains(num-1)){
                int current = num;
                tempResult = 1;

                while(seen.contains(current+1)){
                    tempResult++;
                    current++;
                }
            }

            result = Math.max(result,tempResult);
        }
        return result;
    }
}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=0; i<nums.length(); i++){
        //     list[i] += 1; 
        // }

        // for(int i=0;i<list.length();i++){
        //     if(list[i] >1){
        //         return false;
        //     }
        // }
        // return true;

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
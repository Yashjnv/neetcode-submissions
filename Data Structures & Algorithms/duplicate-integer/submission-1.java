class Solution {
    public boolean hasDuplicate(int[] nums) {
       List<Integer> ls = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(ls.isEmpty() || !ls.contains(nums[i])){
               ls.add(nums[i]);
            }else{
                return true;
            }
        }
        return false;
    }
}
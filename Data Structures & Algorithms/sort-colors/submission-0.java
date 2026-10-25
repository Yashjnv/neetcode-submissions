class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for(int num : nums){
            if(num == 1){
                arr[1]+=1;
            }
            else if(num == 2){
                arr[2]+=1;
            }
            
        }
        for(int i=nums.length-1;i>=0;i--){
            if(arr[2] != 0){
                nums[i]=2;
                arr[2] -= 1;
            }
            else if(arr[1]!=0){
                nums[i]=1;
                arr[1] -=1;
            }
            else{
                nums[i]=0;
            }
        }
    }
}
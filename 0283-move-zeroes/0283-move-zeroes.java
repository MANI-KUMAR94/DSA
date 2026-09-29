class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        //left = it is the place where upcoming non zero element to be placed!
        while(right <= nums.length-1){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right++;
            }else{
                right++;
            }
        }
    }
}
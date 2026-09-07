class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        comSum(candidates,0,target,new ArrayList<Integer>(),ans);  
        return ans;
    }
        static void comSum(int[] nums,int index, int target,List<Integer> current,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(current));
            return ;
        }
        if(index == nums.length){
            return ;
        }
        if(nums[index] <= target){
            current.add(nums[index]);
            comSum(nums, index, target-nums[index],current,ans);
            current.remove(current.size()-1);
        }
        comSum(nums, index+1, target, current,ans);
    }
}
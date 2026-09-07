class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        helper(nums,new ArrayList<>(),used,ans);
        return ans;
    }
    void helper(int nums[],
                List<Integer> temp,
                boolean used[],
                List<List<Integer>> ans)
    {
        if(temp.size()==nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!used[i])
            {
                used[i]=true;
                temp.add(nums[i]);
                helper(nums,temp,used,ans);
                temp.remove(temp.size()-1);
                used[i]=false;
            }
        }
    }
}
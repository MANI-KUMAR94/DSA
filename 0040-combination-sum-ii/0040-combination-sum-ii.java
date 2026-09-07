class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates,0,target,new ArrayList<Integer>(),ans);
        return ans;
    }
    static void solve(int[] arr, int index, int target,
                      List<Integer> current,
                      List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            // Skip duplicates
            if (i > index && arr[i] == arr[i - 1])
                continue;

            // No need to continue
            if (arr[i] > target)
                break;

            current.add(arr[i]);

            solve(arr, i + 1, target - arr[i], current, ans);

            current.remove(current.size() - 1);
        }
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        if (!ans.contains(temp)) {
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
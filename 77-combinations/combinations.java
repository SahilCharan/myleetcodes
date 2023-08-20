class Solution {

    private void solve(int ind, int n, int k, List<Integer> ds, List<List<Integer>> ans) {
        if (k == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i <= n - k + 1; i++) {
            ds.add(i);
            solve(i + 1, n, k - 1, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(1, n, k, new ArrayList<Integer>(), ans);
        return ans;
    }
}
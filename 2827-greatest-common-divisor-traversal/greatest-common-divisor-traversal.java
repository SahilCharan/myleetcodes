class Solution {
    public boolean canTraverseAllPairs(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int minNum = Arrays.stream(nums).reduce(10000000, (a, b) -> Math.min(a, b));
        if (minNum == 1) {
            return false;
        }

        int maxNum = Arrays.stream(nums).reduce(0, (a, b) -> Math.max(a, b));
        UnionFind union = new UnionFind(maxNum + 1);
        for (int num: nums) {
            for (int i = 2; i <= (int)Math.sqrt(num); i++) {
                if (num % i == 0 && num / i != 1) {
                    union.union(num, i);
                    union.union(num, num / i);
                }
            }
        }
        int first = nums[0];
        for (int num: nums) {
            if (!union.connected(num, first)) {
                return false;
            }
        }
        return true;
    }
}

class UnionFind {

    int[] ranks;
    int[] groups;
    int groupsNum;

    public UnionFind(int n) {
        groupsNum = n;
        ranks = new int[n];
        groups = new int[n];
        Arrays.fill(ranks, 1);
        for (int i = 0; i < n; i++) {
            groups[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int q) {
        while (groups[q] != q) {
            groups[q] = groups[groups[q]];
            q = groups[q];
        }
        return q;
    }

    public void reset(int q) {
        groups[q] = q;
        ranks[q] = 1;
    }

    public boolean union(int p, int q) {
        int gp = find(p);
        int gq = find(q);
        if (gp == gq) {
            return false;
        }
        if (ranks[gp] < ranks[gq]) {
            groups[gp] = gq;
            ranks[gq] += ranks[gp];
        } else {
            groups[gq] = gp;
            ranks[gp] += ranks[gq];
        }
        groupsNum--;
        return true;
    }

    public List<Integer> peopleInGroup(int g) {
        return IntStream.range(0, groups.length).filter(i -> find(i) == g).boxed().toList();
    }
}
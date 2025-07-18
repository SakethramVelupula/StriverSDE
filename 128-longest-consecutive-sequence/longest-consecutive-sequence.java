class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int current = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    current++;
                }
                longest = Math.max(longest, current);
            }
        }
        return longest;
    }
}
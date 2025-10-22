class Solution {
    public int[] twoSumBruteForce(int[] nums, int target) {
        // Using brute force
        // Iterating through each elementy(i)
        for (int i = 0; i < nums.length; i++) {
            // Iterates through the rest of the elements after nums[i]
            for (int j = i + 1; j < nums.length; j++) {
                // checking if equal
                if (nums[i] + nums[j] == target) {
                    // returning index of the two nums
                    return new int[] { i, j };
                }
            }
        }

        // Incase there is no solution
        throw new IllegalArgumentException("No two sum solution");

    }
}
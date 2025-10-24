import java.util.Arrays;

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

class Solution2 {
    private static class pair {
        int value;
        int originalIndex;

        public Pair(int value, int originalIndex){
            this.value = value;
            this.originalIndex = originalIndex;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Pair[] pairs = new Pair[n];

        // Storing the value and original index
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(nums[i], i);
        }

        // sorting the pairs
        Arrays.sort(pairs, (a, b) -> a.value - b.value);

        // Initializing two pointers to use
        int left = 0; // first value
        int right = n - 1; // the last value

        // iterate through the pairs using the pointers;
        while (left < right) {
            int sum = pairs[left].value + pairs[right].value;

            if (sum == target) {
                return new int[] { pairs[left].originalIndex, pairs[right].originalIndex };
            } else if (sum < target) {
                left++; // A larger sum needed, move to the next value
            } else {
                right--; // smaller number needed, move to the previous value in the array
            }
        }

        // error if none is found
        throw new IllegalArgumentException("No Two sum solution");
    }
}
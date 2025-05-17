public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to track the position of non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the non-val element to the front
                k++;
            }
        }

        return k;
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution(); // Correct class name
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = solution.removeElement(nums, val);

        System.out.println("Number of elements not equal to " + val + ": " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

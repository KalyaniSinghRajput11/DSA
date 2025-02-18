class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) { 
                j++; 
                nums[j] = nums[i]; 
            }
        }
        return j + 1; 
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {1, 1, 2};
        int k1 = sol.removeDuplicates(nums1);
        System.out.println("Output: " + k1);
        System.out.println("Modified Array: " + java.util.Arrays.toString(nums1));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = sol.removeDuplicates(nums2);
        System.out.println("Output: " + k2);
        System.out.println("Modified Array: " + java.util.Arrays.toString(nums2));
    }
}

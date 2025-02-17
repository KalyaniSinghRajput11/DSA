class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int []arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                arr[0] = map.get(diff);
                arr[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }
        return arr;
    }

}
class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] results = new int[nums.length+nums.length];

        System.arraycopy(nums, 0, results, 0, nums.length);

        System.arraycopy(nums, 0, results, nums.length, nums.length);

        return results;

        
    }
}
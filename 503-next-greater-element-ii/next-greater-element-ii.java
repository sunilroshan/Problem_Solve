class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();

        int res[] = new int[nums.length];

        // concept of double array in circular array

        for (int i = 2 * nums.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums[i % nums.length]) {
                st.pop();
            }

            if (i < nums.length) {
                if (st.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = st.peek();
                }
            }

            st.push(nums[i % nums.length]);
        }

        return res;
        // Time Complexity = 4N
    }
}
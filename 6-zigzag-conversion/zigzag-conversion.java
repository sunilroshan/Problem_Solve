class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        String ans = "";
        int diagIdx = 0;

        for (int i = 0; i < numRows; i++) {
            int increment = 2 * (numRows - 1);

            for (int j = i; j < s.length(); j = j + increment) {
                ans += s.charAt(j);
                if (i > 0 && i < numRows - 1) {
                    diagIdx = j + increment - 2 * i;

                    if (diagIdx < s.length()) {
                        ans += s.charAt(diagIdx);
                    }
                }
            }

        }

        return ans;

    }
}
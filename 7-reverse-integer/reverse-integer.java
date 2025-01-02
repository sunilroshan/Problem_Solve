class Solution {
    public int reverse(int n) {
        long min = Integer.MIN_VALUE;
        long max = Integer.MAX_VALUE;

        long t = 0;
        int r = 0;
        while (n != 0) {
            r = n % 10;
            t = t * 10 + r;
            n = n / 10;
        }
        if (t < min || t > max) return 0;
        
        return (int) t;
    }
}
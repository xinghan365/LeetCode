package zhihui.xu.algorithm.no9;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            System.out.println("x=" + x);
            System.out.println("revertedNumber=" + revertedNumber);
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
            System.out.println("x=" + x);
            System.out.println("revertedNumber=" + revertedNumber);
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        new Solution().isPalindrome(121);
    }
}
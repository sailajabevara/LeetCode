class Solution {
    public boolean checkDivisibility(int n) {

        int original = n;
        int sum = 0, pro = 1;

        while (n > 0) {
            sum += n % 10;
            pro *= n % 10;
            n /= 10;
        }

        return original % (sum + pro) == 0;
    }
}
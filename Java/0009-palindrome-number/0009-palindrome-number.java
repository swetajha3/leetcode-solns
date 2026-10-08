class Solution {
    public boolean isPalindrome(int x) {
        long rev = 0; int r; int num = x;
        while (num!=0){
            r = num%10;
            rev = rev*10+r;
            num = num/10;
        }
        if (rev>Math.pow(2,31)-1 || rev<Math.pow(-2,31))
        return false;
        if (rev == x && x>=0)
            return true;
            return false;

        
    }
}
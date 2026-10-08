class Solution {
    public int reverse(int x) {
        if(x>(Math.pow(2,31)-1)|| x<Math.pow(-2,31))
        return 0;

        int num = x; long rev=0; int r;
        while(num!=0){
            r = num%10;
            rev = rev*10+r;
            num = num/10;
        }
         if(rev>(Math.pow(2,31)-1)|| rev<Math.pow(-2,31))
        return 0;
        return (int)rev;
    }
}
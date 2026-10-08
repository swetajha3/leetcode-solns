class Solution {
    int value(char c){
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return -9999;
    }
    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i<(s.length()); i++)
        {
            int next = 0;
            int current = value(s.charAt(i));
            if((i+1)!= s.length())
            next = value(s.charAt(i+1));
            if (current>=next){
                num += current;
            } else if (current<next)
            num -= current;
        }
        return num;
    }
}
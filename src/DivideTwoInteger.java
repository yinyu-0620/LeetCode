public class DivideTwoInteger {
    public int divide(int dividend, int divisor) {
        boolean minus = true ? ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) : false;
        if(dividend == Integer.MIN_VALUE){
            if(divisor == -1){
                return Integer.MAX_VALUE;
            }
            if(divisor == Integer.MIN_VALUE){
                return 1;
            }
        }
        int ans = 0;
        int rest, sub, i;
        if(dividend > 0){
            rest = opposite(dividend);
        }else{
            rest = dividend;
        }
        if(divisor > 0){
            divisor = opposite(divisor);
        }
        while(rest <= divisor){
            sub = divisor;
            i = 1;
            while(rest <= sub){
                //System.out.println(rest+" "+sub);
                rest = rest - sub;
                ans = ans + i;
                i = i << 1;
                if(sub<<1 > 0){
                    break;
                }else{
                    sub = sub << 1;
                }
            }
        }
        if(minus){
            ans = opposite(ans);
        }
        return ans;
    }
    public int opposite(int i){
        return ~i+1;
    }
}

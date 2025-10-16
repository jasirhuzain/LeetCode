class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse1 = rev(num);
        int reverse2 = rev(reverse1);
        if(reverse2==num) return true;
        return false;
    }
    
    public static int rev(int n){
        int r =0;
        while(n!=0){
            int digit = n%10;
            n = n/10;
         r = r*10 +digit;
        }
        return r;
        
    }
    
}
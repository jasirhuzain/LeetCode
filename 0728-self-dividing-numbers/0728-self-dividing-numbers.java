class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i =left;i<=right;i++){
            if(selfDiv(i)){
                result.add(i);
            }
        }
        return result;
        
    }
    static boolean selfDiv(int num) {
         if(num<1){
             return false;
         }

         int original = num;
         while(num!=0){
             int digit = num%10;
             if(digit==0 || original%digit !=0){
                 return false;
             }
             num/=10;
         }
         return true;
     }
}
class Solution {
    public int maxProfit(int[] prices) {
     int lsf=28700010;
     int op=0;
     int pist=0; 
     for(int i =0;i<prices.length;i++){
        if(prices[i]<lsf){
            lsf=prices[i];
        }
        pist=prices[i]-lsf;
        if(op<pist){
            op=pist;
        }
     }
     return op;  
    }
}
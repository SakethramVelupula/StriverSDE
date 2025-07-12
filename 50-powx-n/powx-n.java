class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long m=Math.abs((long)n);
        while(m>0){
            if(m%2!=0){
                ans*=x;
                m--;
            }
            else{
                x=x*x;
                m=m/2;
            }
        }
        if(n>=0){
            return ans;
        }
        else{
            return 1/ans;
        }
        // double m=1;
        // for(int i=1;i<=Math.abs(n);i++){
        //     m=m*x;
        // }
        // if(n>0){
        //     return m;
        // }
        // else{
        //     return 1/m;
        // }

    }
}
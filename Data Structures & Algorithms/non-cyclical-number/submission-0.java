class Solution {
    public boolean isHappy(int n) {
        while(n !=1 && n!=4){
            n=sumofsquare(n);
        }
        return n==1;
    }

    public static int sumofsquare(int n){
        int a=0;
        while(n != 0){
            int d=n%10;
            a+=d*d;
            n/=10;
        }
        return a;
    }
}

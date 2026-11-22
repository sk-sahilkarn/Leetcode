class Solution {
    public boolean isPowerOfFour(int n) {
        double power = Math.log(n)/Math.log(4);

        if( n>0 && power==Math.floor(power)){
            return true;
        }
        else{
            return false;
        }
        
    }
}

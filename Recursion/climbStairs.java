public class climbStairs {
    public static int stairclimb(int num){
        if(num < 0){
            return 0;
        }
        if(num == 0){
            return 1;
        }
        int ways = stairclimb(num-1) + stairclimb(num-2);
        return ways;
    }
    public static void main(String args[]){
        int num = 4;
        System.out.println(stairclimb(num));
    }    
}

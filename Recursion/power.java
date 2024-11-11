public class power {
    public static int power(int number, int pow){
        if(pow == 0){
            return 1;
        }
        return number * power(number, pow-1);
    }
    public static void main(String args[]){
        int ans = power(5,3);
        System.out.println(ans);
    }
}

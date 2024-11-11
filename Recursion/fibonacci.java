public class fibonacci {
    public static int f(int term){
        if(term == 0){
            return 0;
        }
        if(term == 1){
            return 1;
        }
        int ans = f(term-1) + f(term-2);
        return ans;

    }
    public static void main(String args[]){
        int term = 7;
        int num = f(term);
        System.out.println(num);
    }
}

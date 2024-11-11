public class printCounting {
    public static void printCounting(int num){
        if(num == -1){
            return;
        }
        printCounting(num-1);
        System.out.println(num);
        
    }
    public static void main(String args[]){
        int num = 10;
        printCounting(num);
    }
}

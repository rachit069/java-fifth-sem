import java.util.Scanner;
public class memo{
    public static int fibmemo(int n, int arr[]){
        if(n<=1){
            return n;
        }
        if(arr[n] != -1){
            return arr[n];
        }
        arr[n] = fibmemo(n-1, arr) + fibmemo(n-2, arr);
        return arr[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i = 0;i<=n;i++){
            arr[i] = -1;
        }
        System.out.println(fibmemo(n, arr));
    }
    
}
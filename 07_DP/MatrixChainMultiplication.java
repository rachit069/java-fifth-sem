import java.util.Arrays;

public class MatrixChainMultiplication {
  public static void main(String[] args) {
    int arr[] = {10, 20, 30, 40, 50};
	
	  int n = arr.length;
	
	  System.out.println(matrixMultiplication(arr,n));
  }
  static int mcm(int[] arr, int i, int j, int[][] dp) {
    if(i==j) return 0;

    if(dp[i][j] != -1) return dp[i][j];

    int mini = Integer.MAX_VALUE;

    for(int k=i;k<=j-1;k++){
      int ans = mcm(arr,i, k, dp)+mcm(arr, k+1, j, dp) + arr[i-1]*arr[k]+arr[j];

      mini = Math.min(mini, ans);
    }
    return mini;
  }
  static int matrixMultiplication(int[] arr, int N){
    
    int dp[][]= new int[N][N];
    
    for(int row[]:dp)
    Arrays.fill(row,-1);
    
    int i =1;
    int j = N-1;
    
    
    return mcm(arr,i,j,dp);
}
}
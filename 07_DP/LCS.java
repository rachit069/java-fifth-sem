import java.util.*;
public class LCS{
  private static int[][] dp1;
  public static void main(String[] args) {
    String s1 = "ABCDE";
    String s2 = "ACE";
    int n1 = 5;
    int n2 = 3;
    dp1 = new int[n1+1][n2+1];
    for(int[] row:dp1){
      Arrays.fill(row, -1);
    }
    System.out.println(longestCommonSub(s1, s2,n1,n2));
  }
  static int longestCommonSub(String s1, String s2, int n1, int n2){
    if(n1==0 ||n2==0) return 0;
    if(s1.charAt(n1-1) == s2.charAt(n2-1)){
      dp1[n1][n2] = 1+longestCommonSub(s1, s2, n1-1, n2-1);
    }
    else {
      dp1[n1][n2] = Math.max(longestCommonSub(s1, s2, n1-1, n2), longestCommonSub(s1, s2, n1, n2-1));
    }

    return dp1[n1][n2];
  }
}
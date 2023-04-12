package backjoon.dp.boj11726;

import java.util.Scanner;

public class Main {


    /*
    2 = 2, 3 = 3, 4 = 5,
     */

    static Integer[] dp;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        dp = new Integer[x + 1];
        dp[0] = 1;
        dp[1] = 2;

        System.out.println(recur(x-1) % 10007);
    }

    static int recur(int N) {
        if (dp[N] == null && N > 1) {
            dp[N] = recur(N - 1) + recur(N - 2);
        }
        return dp[N];
    }
}
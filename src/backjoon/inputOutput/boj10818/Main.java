package backjoon.inputOutput.boj10818;


import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        System.out.printf("%d %d",min,max);
    }
}
package backjoon.study.sort.k번째수_11004;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n =Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] intArr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(intArr);

        System.out.println(intArr[k - 1]);
    }
}
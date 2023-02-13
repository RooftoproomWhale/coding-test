package backjoon.inputOutput.boj10953;


import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++)
        {
            String s = sc.next();
            String[] strArr = s.split(",");
            System.out.println(Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]));
        }

    }
}
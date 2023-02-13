package backjoon.inputOutput.boj11720;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        for (int i = 0; i < a.length(); i++)
        {
            if (((i + 1) % 10 != 0)) {
                System.out.print(a.charAt(i));
            } else {
                System.out.println(a.charAt(i));
            }
        }
    }
}
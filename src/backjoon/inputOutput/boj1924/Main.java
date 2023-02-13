package backjoon.inputOutput.boj1924;


import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        int[] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        Scanner sc = new Scanner(System.in);
        int mouth = sc.nextInt();
        int day = sc.nextInt();

        int daySum = 0;
        for (int i = 0; i < mouth; i++)
        {
            daySum += arr[i];
        }
        daySum += day;

        switch (daySum % 7)
        {
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            default:
                System.out.println("SAT");
        }
    }
}
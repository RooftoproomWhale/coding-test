package backjoon.study.sort.세_수_10817;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++)
        {
            list.add(sc.nextInt());
        }

        selectionSort(list);

        System.out.println(list.get(1));

    }

    private static void selectionSort(ArrayList<Integer> list)
    {
        int lowest;
        for(int i = 0; i < list.size() -1; i++)
        {
            lowest = i;
            for(int j = i + 1; j < list.size(); j++)
            {
                if(list.get(j) < list.get(lowest))
                    lowest = j;
            }
            Collections.swap(list, i, lowest);
        }
    }
}
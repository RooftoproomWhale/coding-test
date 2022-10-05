package study.sort.세수정렬_2752;

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

        insertionSort(list);

        for (int i : list)
        {
            System.out.print(i +" ");
        }

    }

    private static void insertionSort(ArrayList<Integer> list)
    {
        for(int i = 1; i < list.size(); i++)
        {
            if(list.get(i - 1) <= list.get(i))
                continue;

            int target = list.get(i);

            int j = i;
            while(j > 0 && list.get(j - 1) > target)
            {
                Collections.swap(list, j, j - 1);
                j--;
            }
            list.set(j, target);
        }
    }
}
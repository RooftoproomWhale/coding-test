package backjoon.study.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++)
        {
            list.add((int)(Math.random() * 100) + 1);
        }

        //bubbleSort(list);
        //selectionSort(list);
        insertionSort(list);

        System.out.println(list);
    }

    private static void bubbleSort(ArrayList<Integer> list)
    {
        for(int i = 0; i < list.size() - 1; i++)
        {
            for(int j = 0; j < list.size() - (i + 1); j++)
            {
                if(list.get(j) > list.get(j + 1))
                    Collections.swap(list, j, j + 1);
            }
        }
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
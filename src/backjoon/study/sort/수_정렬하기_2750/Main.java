package backjoon.study.sort.수_정렬하기_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            list.add(Integer.parseInt(br.readLine()));
        }

        bubbleSort(list);
        list.forEach(System.out::println);
    }

    private static void bubbleSort(ArrayList<Integer> list)
    {
        boolean isSwap = false;
        for(int i = 0; i < list.size() - 1; i++)
        {
            for(int j = 0; j < list.size() - (i + 1); j++)
            {
                if(list.get(j) > list.get(j + 1))
                {
                    Collections.swap(list, j, j + 1);
                    isSwap = true;
                }
            }
            if(!isSwap) break;
        }
    }
}
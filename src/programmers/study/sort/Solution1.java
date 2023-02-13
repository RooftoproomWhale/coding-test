package programmers.study.sort;

import java.util.Arrays;

public class Solution1 {
    public int[] solution(int[] array, int[][] commands) {

        int[] result = new int[commands.length];

        int i = 0;
        for (int[] command : commands) {

            int start = command[0];
            int end = command[1];
            int index = command[2];

            int[] slicedArray = Arrays.copyOfRange(array, start - 1, end);

            bubbleSort(slicedArray);

            result[i++] = slicedArray[index - 1];
        }

        return result;
    }

    private static void bubbleSort(int[] list)
    {
        boolean isSwap = false;
        for(int i = 0; i < list.length - 1; i++)
        {
            for(int j = 0; j < list.length - (i + 1); j++)
            {
                if(list[j] > list[j + 1])
                {
                    swap(list, j, j + 1);
                    isSwap = true;
                }
            }
            if(!isSwap) break;
        }
    }

    private static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
package programmers.study.sort;

public class Solution3 {
    public int solution(int[] citations) {

        int result = 0;

        selectionSort(citations);

        //[0, 1, 3, 5, 6]



        return result;
    }

    private static void selectionSort(int[] list)
    {
        int lowest;
        for(int i = 0; i < list.length -1; i++)
        {
            lowest = i;
            for(int j = i + 1; j < list.length; j++)
            {
                if(list[j] > list[lowest])
                    lowest = j;
            }
            swap(list, i, lowest);
        }
    }

    private static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
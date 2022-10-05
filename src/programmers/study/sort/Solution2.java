package programmers.study.sort;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution2 {
    public String solution(int[] numbers) {

        /*
        String result = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((t1, t2) -> (t2 + t1).compareTo((t1 + t2)))
                .collect(Collectors.joining());

         */

        List<String> list = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());

        bubbleSort(list);

        String result = list.stream().collect(Collectors.joining());

        if(result.startsWith("0")) return "0";

        return result;
    }

    private static void bubbleSort(List<String> list)
    {
        boolean isSwap = false;
        for(int i = 0; i < list.size() - 1; i++)
        {
            for(int j = 0; j < list.size() - (i + 1); j++)
            {
                if((list.get(j) + list.get(j + 1)).compareTo(list.get(j + 1) + list.get(j)) > 0)
                {
                    Collections.swap(list, j, j + 1);
                    isSwap = true;
                }
            }
            if(!isSwap) break;
        }
    }

}
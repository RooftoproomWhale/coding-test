package programmers.study.DP;

import java.util.Arrays;

public class Solution2 {
    public long solution(int n, int[] times) {
        long answer = 0;

        Arrays.sort(times);
        long left = 0;
        long right =  (long) n * times[times.length - 1];

        while (left <= right)
        {
            long mid = (left + right) / 2;
            long sum = 0;

            for (int time : times)
            {
                sum += mid / time;
            }

            if (sum < n)
            {
                left = mid + 1;
                continue;
            }
            right = mid - 1;
            answer = mid;
        }

        return answer;
    }
}

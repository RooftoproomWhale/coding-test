package programmers.study.search;

public class Solution1 {
    public int solution(int[] stones, int k) {
        int answer = 0;

        int min = 0; int max = 200000000;
        while (min <= max)
        {
            int mid = (min + max) / 2;

            if(isAcross(stones, k, mid))
            {
                min = mid + 1;
                answer = Math.max(answer, mid);
                continue;
            }
            max = mid - 1;
        }

        return answer;
    }

    private boolean isAcross(int[] stones, int k, int mid)
    {
        int count = 0;

        for (int stone : stones)
        {
            if(stone < mid) count++;
            else count = 0;

            if(count == k) return false;
        }

        return true;
    }
}
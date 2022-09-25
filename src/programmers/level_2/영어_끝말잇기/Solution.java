package programmers.level_2.영어_끝말잇기;
import java.util.HashSet;
public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        char chFirst;
        char chEnd = words[0].charAt(words[0].length() - 1);
        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        for(int i = 1; i < words.length; i++)
        {
            chFirst = words[i].charAt(0);
            set.add(words[i]);
            if(chEnd != chFirst || set.size() != i + 1)
            {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }

            chEnd = words[i].charAt(words[i].length() - 1);
        }

        return answer;
    }
}
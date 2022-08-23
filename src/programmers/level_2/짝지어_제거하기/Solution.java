package programmers.level_2.짝지어_제거하기;
import java.util.ArrayDeque;

public class Solution
{
    public int solution(String s)
    {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray())
        {
            if(stack.size() > 0 && stack.peekLast() == c)
            {
                stack.pop();
                continue;
            }
            stack.push(c);
        }

        return (stack.size() == 0 ? 1 : 0);
    }
}

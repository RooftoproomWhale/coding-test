package programmers.level_1.숫자_문자열과_영단어;

public class Solution {
    public int solution(String s) {
        String[] intToEng = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i = 0; i < intToEng.length; i++)
        {
            if(s.contains(intToEng[i]))
                s = s.replace(intToEng[i], Integer.toString(i));
        }

        return  Integer.parseInt(s);
    }
}
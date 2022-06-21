package 无重复字符的最长字符串;

/*给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。*/

import java.util.HashSet;
public class Main{
    public static void main(String[] args) {
        String s = "au";
        Solution solution = new Solution();
        int a = solution.lengthOfLongestSubstring(s);
        System.out.println(a);
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        char[] chars = s.toCharArray();
        HashSet str = new HashSet();
        if (chars.length == 1){
            return 1;
        }else {
            for (int j = 0; j < chars.length - 1; j++) {
                str.add(chars[j]);
                for (int i = j + 1; i < chars.length; i++) {
                    boolean flag = str.add(chars[i]);
                    if (flag == false || i == chars.length-1) {
                        len = len > str.size() ? len : str.size();
                        str.clear();
                        break;
                    }
                }
            }

            return len;
        }
    }
}
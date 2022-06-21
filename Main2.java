package 无重复字符的最长字符串;

public class Main2 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Solution2 solution2 = new Solution2();
        int a = solution2.lengthOfLongestSubstring(s);
        System.out.println(a);
    }
}

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置

        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            // 起始坐标为0，Start 位置与index中记录的每个字符出现的最新位置有关，
            res   = Math.max(res, i - start + 1);
            // res = 当前判断的字符与起始字符之间的距离，并于res之前的最大值对比，取最大值
            last[index] = i;
            // 将每个字符出现的最新位置记录下来
        }

        return res;
    }
}
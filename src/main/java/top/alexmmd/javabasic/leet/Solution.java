package top.alexmmd.javabasic.leet;

/**
 * @author 汪永晖
 * @Date 2020/12/16 19:35
 */
public class Solution {

    public boolean wordPattern(String pattern, String s) {
        char[] p = pattern.toCharArray();
        String[] strings = s.split(" ");
        int length = p.length;
        boolean flag = false;

        if (length == 1) {
            return true;
        }

        for (int i = 0; i <= length - 2; i++) {
            System.out.println("strings[i] = " + strings[i]);
            System.out.println("strings[i + 1] = " + strings[i + 1]);
            System.out.println("p[i] = " + p[i]);
            System.out.println("p[i + 1] = " + p[i + 1]);
            if ((strings[i].equals(strings[i + 1])) == (p[i] == p[i + 1])) {
                flag = true;
                continue;
            } else {
                return false;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        String p = "abba";
        String s = "dog cat cat bo";

        Solution solution = new Solution();
        System.out.println(solution.wordPattern(p, s));
    }
}

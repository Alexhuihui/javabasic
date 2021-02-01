package top.alexmmd.javabasic.bytecode;

/**
 * @author 汪永晖
 * @Date 2020/12/10 13:45
 */
public class SomeClass {

    public static void main(String[] args) {
        System.out.println(indexOf("ababdef", "ab"));
    }

    public static int indexOf(String source, String str) {
        char[] sourceCharList = source.toCharArray();
        char[] strCharList = str.toCharArray();
        boolean flag = false;
        int j = 0;

        int sourceLength = sourceCharList.length;
        int strLength = strCharList.length;
        char first = strCharList[0];

        for (int i = 0; i < sourceLength; i++) {
            if (flag) {
                if (j == strLength) {
                    return i - strLength;
                }
                if (strCharList[j] == sourceCharList[i]) {
                    j++;
                    continue;
                } else {
                    flag = false;
                    j = 0;
                }
            }
            if (sourceCharList[i] == first) {
                flag = true;
                j++;
            } else {
                flag = false;
            }
        }
        return -1;
    }
}

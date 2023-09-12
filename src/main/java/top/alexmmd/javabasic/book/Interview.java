package top.alexmmd.javabasic.book;

/**
 * @author wangyonghui
 * @since 2023年09月12日 19:23:00
 */
public class Interview {

    /**
     * 反转字符串
     */
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    /**
     * 查找数组中的最大值
     */
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        String s = reverseString("123456");
        System.out.println("s = " + s);

    }


}

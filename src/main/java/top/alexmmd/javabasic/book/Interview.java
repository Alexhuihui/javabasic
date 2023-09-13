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


    public static int maxCommonDivisor(int a, int b) {
        int temp = a;
        if (a < b) {
            a = b;
            b = temp;
        }
        while (temp != 0) {
            temp = a % b;
            System.out.println("temp = " + temp);
            a = b;
            b = temp;
        }
        return a;


    }

    public static void sortArray(int[] arr) {
        // 使用冒泡排序算法
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换arr[j]和arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // 如果在本轮没有发生交换，说明数组已经有序，可提前退出循环
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("maxCommonDivisor = " + maxCommonDivisor(6, 4));
    }


}

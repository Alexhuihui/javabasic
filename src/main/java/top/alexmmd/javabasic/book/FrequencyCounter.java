package top.alexmmd.javabasic.book;

import org.springframework.util.StopWatch;

/**
 * @author 汪永晖
 * @Date 2021/1/25 14:57
 */
public class FrequencyCounter {

    public static void main(String[] args) {
        int distinct = 0, words = 0;
        int minlen = Integer.parseInt(args[0]);
        System.out.println("minlen = " + minlen);
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();

        // compute frequency counts
        StopWatch sw = new StopWatch();
        sw.start();
        while (!StdIn.isEmpty()) {
            String key = StdIn.readString();
            if (key.length() < minlen) continue;
            words++;
            if (st.contains(key)) {
                st.put(key, st.get(key) + 1);
            } else {
                st.put(key, 1);
                distinct++;
            }
        }

        // find a key with the highest frequency count
        String max = "";
        st.put(max, 0);
        for (String word : st.keys()) {
            if (st.get(word) > st.get(max))
                max = word;
        }

        sw.stop();
        StdOut.print(sw.getTotalTimeSeconds());
        StdOut.println(max + " " + st.get(max));
        StdOut.println("distinct = " + distinct);
        StdOut.println("words  = " + words);
    }
}

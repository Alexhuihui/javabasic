package top.alexmmd.javabasic.book;

/**
 * @author 汪永晖
 * @Date 2021/2/1 14:08
 */
public class Evaluate {

    public static void main(String[] args) {
        ResizingArrayStack<String> ops = new ResizingArrayStack<>();
        ResizingArrayStack<Double> vals = new ResizingArrayStack<>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("(")) {
                System.out.println("忽略左括号");
            } else if (s.equals("+")) {
                ops.push(s);
            } else if (s.equals("-")) {
                ops.push(s);
            } else if (s.equals("*")) {
                ops.push(s);
            } else if (s.equals("/")) {
                ops.push(s);
            } else if (s.equals("sqrt")) {
                ops.push(s);
            } else if (s.equals(")")) {
                String op = ops.pop();
                Double value = vals.pop();
                if (op.equals("+")) {
                    value = vals.pop() + value;
                } else if (op.equals("-")) {
                    value = vals.pop() - value;
                } else if (op.equals("-")) {
                    value = vals.pop() - value;
                } else if (op.equals("*")) {
                    value = vals.pop() * value;
                } else if (op.equals("/")) {
                    value = vals.pop() / value;
                } else if (op.equals("sqrt")) {
                    value = Math.sqrt(value);
                }
                vals.push(value);
            } else {
                vals.push(Double.valueOf(s));
            }
        }

        StdOut.print(vals.pop());
    }
}

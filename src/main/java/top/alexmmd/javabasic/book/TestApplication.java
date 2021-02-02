package top.alexmmd.javabasic.book;

public class TestApplication {

    public static void main(String[] args) {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<String>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                System.out.print(s.pop() + " ");;
            }
        }

        System.out.println("(" + s.size() + " left on stack)");
    }
}

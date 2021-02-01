package top.alexmmd.javabasic.book;

public class TestApplication {

    public static void main(String[] args) {
        LinkedListQueue<String> s;
        s = new LinkedListQueue<String>();

        for (int i = 0; i < args.length; i++) {
            String item = args[i];
            if (!item.equals("-")) {
                s.enqueue(item);
            } else if (!s.isEmpty()) {
                System.out.print(s.dequeue() + " ");;
            }
        }

        System.out.println("(" + s.size() + " left on stack)");
    }
}

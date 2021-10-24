package top.alexmmd.javabasic.geek.stack;

public class ArrayStack {

    private String[] items;
    private int count;
    private int n;

    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
    }

    public boolean push(String item) {
        if (count == n) {
            // 栈满
            return false;
        }
        items[count++] = item;
        return true;
    }

    public String pop() {
        if (count == 0) {
            // 栈空
            return null;
        }
        String item = items[count - 1];
        items[count - 1] = null;
        count--;
        return item;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            stringBuilder.append(items[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        for (int i = 0; i < 6; i++) {
            boolean push = arrayStack.push(String.valueOf(i));
            System.out.println("push = " + push);
        }
        System.out.println("arrayStack = " + arrayStack);
        String item = arrayStack.pop();
        while (item != null) {
            System.out.println("item = " + item);
            item = arrayStack.pop();
        }
        System.out.println("arrayStack = " + arrayStack);
    }
}


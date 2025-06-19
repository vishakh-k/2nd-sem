 public class OverloadDemo {
    int value;

    OverloadDemo() {
        value = 0;
    }

    OverloadDemo(int v) {
        value = v;
    }

    void show() {
        System.out.println("Value: " + value);
    }

    void show(String msg) {
        System.out.println(msg + ": " + value);
    }

    public static void main(String[] args) {
        OverloadDemo obj1 = new OverloadDemo();
        OverloadDemo obj2 = new OverloadDemo(100);
        obj1.show();
        obj2.show("Overloaded method");
    }
}


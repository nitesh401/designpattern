package singleton;

import singleton.SingletonExample;

public class Main {
    public static void main(String[] args) {
        SingletonExample instance = SingletonExample.getInstance();
        instance.showMessage();

    }
}

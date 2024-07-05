package Packagejava.util.function;

import java.util.function.Consumer;

public class ConsumerApp {

    public static void main(String[] args) {

        Consumer<String> consumer = System.out::println;

        consumer.accept("Audyari Wiyono");

    }
}

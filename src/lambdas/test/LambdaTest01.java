package lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        List<String> strings = List.of("Wesley", "Tina", "Komi san", "Naruto", "Alice");
        forEeach(strings, (String s) -> System.out.println(s));
        forEeach(integers, i -> System.out.println(i));
    }

    private static <T> void forEeach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}

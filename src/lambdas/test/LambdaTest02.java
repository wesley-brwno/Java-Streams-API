package lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Allucard", "Zoro");
        List<Integer> integers = map(strings, s -> s.length());
        List<String> map = map(strings, s -> s.toUpperCase());
        System.out.println(integers);
        System.out.println(map);

        System.out.println("_____________");

        List<Integer> stringSize = strings.stream().map(s -> s.length()).toList();
        System.out.println(stringSize);
        List<String> uppercaseStrings = strings.stream().map(s -> s.toUpperCase()).toList();
        System.out.println(uppercaseStrings);
    }

    private static <T, R>List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }
}

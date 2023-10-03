package lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru", "Komi san"));
        list.sort(String::compareTo);
        System.out.println(list);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("20")+1);

        ArrayList<String> numbersAsStrings = new ArrayList<>(List.of("1", "2", "3"));
        numbersAsStrings.stream().map(Integer::parseInt).forEach( num -> System.out.println(num + 2));

        System.out.println("--------------------");
        List<Double> list2 = numbersAsStrings.stream().map(Double::parseDouble).map(number -> number + 0.1).toList();
        System.out.println(list2);
        System.out.println("--------------------");

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Komi san"));

        list.stream().filter(s -> s.matches("\\w+")).forEach(s -> System.out.println("Hi " + s));
    }
}

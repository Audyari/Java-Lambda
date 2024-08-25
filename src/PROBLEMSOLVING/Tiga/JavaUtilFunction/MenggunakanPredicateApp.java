package PROBLEMSOLVING.Tiga.JavaUtilFunction;

import java.util.function.Predicate;

public class MenggunakanPredicateApp {

    public static void main(String[] args) {

        Predicate<String> testData = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isBlank();
            }
        };

        System.out.println(testData.test("DATA NYA ADA"));
        System.out.println(testData.test(""));


    }
}

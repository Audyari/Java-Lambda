package PROBLEMSOLVING.Tiga.JavaUtilFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestSendiri {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> cariBilanganGenap = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        for (var hasil : numbers) {
            if (cariBilanganGenap.test(hasil)) {
                System.out.println(hasil + " GENAP");
            } else {
                System.out.println(hasil + " GANJIL");
            }
        }
    }
}

package PROBLEMSOLVING.Lima.LamdaDiColection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class lamdaRemoveIf {
    public static void main(String[] args) {

        // lamda colectine di removeIF

        List<String> testData = new ArrayList<>();
        testData.addAll(List.of("AUDY", "BUDI", "CANDRA"));

//        testData.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() > 5;
//            }
//        });

        testData.removeIf(s -> s.length() > 5);

        System.out.println(testData);
    }
}

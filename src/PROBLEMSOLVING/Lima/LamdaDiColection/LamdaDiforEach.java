package PROBLEMSOLVING.Lima.LamdaDiColection;

import java.util.List;
import java.util.function.Consumer;

public class LamdaDiforEach {
    public static void main(String[] args) {

        // lamda di forEach Colection
        List<String> testData = List.of("AUDY","BUDI","CANDRA");

//        testData.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        testData.forEach(System.out::println);
    }
}

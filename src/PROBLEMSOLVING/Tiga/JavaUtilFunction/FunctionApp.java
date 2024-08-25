package PROBLEMSOLVING.Tiga.JavaUtilFunction;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        Function<String,Integer> testDatanya = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

       Integer PanjangKata = testDatanya.apply("AUDYARI WIYONO");
        System.out.println(PanjangKata);

    }
}

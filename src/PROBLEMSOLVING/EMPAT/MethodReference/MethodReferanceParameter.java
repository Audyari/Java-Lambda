package PROBLEMSOLVING.EMPAT.MethodReference;

import java.util.function.Function;

public class MethodReferanceParameter {
    public static void main(String[] args) {

//        Function<String,String> upercase = new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        };

        Function<String,String> upercase = String::toUpperCase;

        System.out.println(upercase.apply("asep"));

    }
}

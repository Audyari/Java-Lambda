package PROBLEMSOLVING.Tiga.JavaUtilFunction;

import java.util.function.Supplier;

public class InterfaceSupplierApp {

    public static void main(String[] args) {
        Supplier<String> testData = new Supplier<String>() {
            @Override
            public String get() {
                return "AUDYARI WIYONO";
            }
        };

        System.out.println(testData.get());
    }


}


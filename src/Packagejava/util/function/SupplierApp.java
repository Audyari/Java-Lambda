package Packagejava.util.function;

import java.util.function.Supplier;

public class SupplierApp {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Audyari Wiyono";

        System.out.println(supplier.get());

    }
}
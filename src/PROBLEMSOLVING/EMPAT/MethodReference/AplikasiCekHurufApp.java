package PROBLEMSOLVING.EMPAT.MethodReference;

import java.util.function.Predicate;

public class AplikasiCekHurufApp {

    public static void main(String[] args) {

        Predicate<String> CekData = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return CekHurufKecil.cekhuruf(s);
            }
        };

        System.out.println(CekData.test("ASEP"));
        System.out.println(CekData.test("asep"));

        Predicate<String> CekData1 = CekHurufKecil::cekhuruf;

        System.out.println(CekData1.test("ASEP"));
        System.out.println(CekData1.test("asep"));
    }
}

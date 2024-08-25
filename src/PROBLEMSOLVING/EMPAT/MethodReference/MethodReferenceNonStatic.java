package PROBLEMSOLVING.EMPAT.MethodReference;

import java.util.function.Predicate;

public class MethodReferenceNonStatic {
    public static void main(String[] args) {

        MethodReferenceNonStatic panggil = new MethodReferenceNonStatic();
        panggil.test("DATA");
        panggil.test("data");

    }

    void test(String asep) {

        Predicate<String> testData = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return MethodReferenceNonStatic.this.cekhurufA(s);
            }
        };
        System.out.println(testData.test(asep));
    }

    public boolean cekhurufA(String datanya) {
        for (var data : datanya.toCharArray()) {
            if (!Character.isLowerCase(data)) {
                return false;
            }
        }
        return true;
    }
}

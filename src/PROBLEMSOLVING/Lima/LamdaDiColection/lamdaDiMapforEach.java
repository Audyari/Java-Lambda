package PROBLEMSOLVING.Lima.LamdaDiColection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class lamdaDiMapforEach {
    public static void main(String[] args) {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("A", "AUDYARI");
        dataMap.put("B", "BUDI");
        dataMap.put("C", "CANDRA");

//        dataMap.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String s, String s2) {
//                System.out.println(" KEY nya : " + s + " Value nya :" + s2);
//            }
//        });

        dataMap.forEach((s, s2) -> System.out.println(" KEY nya : " + s + " Value nya :" + s2));

    }
}

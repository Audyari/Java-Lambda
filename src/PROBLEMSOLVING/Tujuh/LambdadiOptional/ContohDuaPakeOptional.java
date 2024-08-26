package PROBLEMSOLVING.Tujuh.LambdadiOptional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class ContohDuaPakeOptional {
    public static void main(String[] args) {

        sayaHello("Audyari");
        sayaHello(null);

    }

    public static void sayaHello(String name){

        Optional<String> TangkapEroorNull = Optional.ofNullable(name);

        Optional<String> upperName = TangkapEroorNull.map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });

        upperName.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}

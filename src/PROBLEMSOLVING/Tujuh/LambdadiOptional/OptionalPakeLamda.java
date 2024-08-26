package PROBLEMSOLVING.Tujuh.LambdadiOptional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalPakeLamda {
    public static void main(String[] args) {

        sayaHello("Audyari");
        sayaHello(null);

    }

    public static void sayaHello(String name){

        Optional<String> TangkapEroorNull = Optional.ofNullable(name);

        Optional<String> upperName = TangkapEroorNull.map(s -> s.toUpperCase());

        upperName.ifPresent(s -> System.out.println(s));

    }
}


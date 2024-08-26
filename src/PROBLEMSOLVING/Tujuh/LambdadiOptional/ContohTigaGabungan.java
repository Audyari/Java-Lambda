package PROBLEMSOLVING.Tujuh.LambdadiOptional;

import java.util.Optional;
import java.util.function.Function;

public class ContohTigaGabungan {

    public static void main(String[] args) {

        sayaHello("Audyari");
        sayaHello(null);

    }

    public static void sayaHello(String name) {

//        Optional<String> TangkapEroorNull = Optional.ofNullable(name);
//        Optional<String> upperName = TangkapEroorNull.map(String::toUpperCase);
//        upperName.ifPresent(System.out::println);



       //Cara Satu
       String test = Optional.ofNullable(name)
               .map(String::toUpperCase)
               .orElse("");



        System.out.println(test);

    }
}


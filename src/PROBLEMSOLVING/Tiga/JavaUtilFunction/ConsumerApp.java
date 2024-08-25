package PROBLEMSOLVING.Tiga.JavaUtilFunction;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

       Consumer<String> tetDatanya = new Consumer<String>() {
           @Override
           public void accept(String s) {
               System.out.println(s);
           }
       };

        tetDatanya.accept("AUDYARI W");
    }
}

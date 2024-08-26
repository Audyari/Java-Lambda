package PROBLEMSOLVING.Enam.LambdaSebagaiLazyParameter;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ContohLazyPakeLamda {
    public static void main(String[] args) {

//       testScore(80, new Supplier<String>() {
//           @Override
//           public String get() {
//               return panggil();
//           }
//       });

       //pake lamda
        testScore(10, ContohLazyPakeLamda::panggil);
    }


    public static void testScore(Integer score, Supplier<String> name) {
        if (score > 50) {
            System.out.println("SELAMAT SCORE DI ATAS " + name.get());
        } else {
            System.out.println("SKOR DIBAWAH");
        }
    }

    public static String panggil() {
        System.out.println("PANGGIL MeTODE STATIC");
        return "AUDY";
    }
}

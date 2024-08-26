package PROBLEMSOLVING.Enam.LambdaSebagaiLazyParameter;

public class ContohLazyApp {
    public static void main(String[] args) {

        testScore(30,panggil());

    }

    public static void testScore(Integer score, String name) {
        if (score > 50) {
            System.out.println("SELAMAT SCORE DI ATAS " + name);
        } else {
            System.out.println("SKOR DIBAWAH");
        }
    }

    public static String panggil(){
        System.out.println("PANGGIL MeTODE STATIC");
        return "AUDY";
    }
}

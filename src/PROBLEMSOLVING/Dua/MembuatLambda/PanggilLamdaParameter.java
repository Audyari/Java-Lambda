package PROBLEMSOLVING.Dua.MembuatLambda;

public class PanggilLamdaParameter {
    public static void main(String[] args) {
        BikinLamdaParameter testData = new BikinLamdaParameter() {
            @Override
            public String metode(String cara) {
                return cara;
            }
        };

        System.out.println(testData.metode("PERGI"));

        BikinLamdaParameter testData2 = (cara) ->{
          return cara ;
        };

        System.out.println(testData2.metode("HAHAI"));

        BikinLamdaParameter data5 = (String cara) -> " DATA NYA" + cara;
        BikinLamdaParameter data4 = (cara) -> " DATA NYA" + cara;
        BikinLamdaParameter data3 = cara -> " DATA NYA" + cara;

        System.out.println(data3.metode("ASEP"));

    }
}

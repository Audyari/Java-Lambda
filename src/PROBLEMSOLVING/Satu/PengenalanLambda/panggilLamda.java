package PROBLEMSOLVING.Satu.PengenalanLambda;

public class panggilLamda {
    public static void main(String[] args) {

       bikinLamda testData = new bikinLamda() {
           @Override
           public Integer Usia() {
               return 0;
           }
       };

       bikinLamda testData2 = ()->{
           return 1;
       };

        System.out.println(testData.Usia());
        System.out.println(testData2.Usia());



    }

}
package PengenalanLambda;

public class SimpleActionApp {

    public static void main(String[] args) {

//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Eko";
//            }
//        };
//
//        System.out.println(simpleAction1.action("Eko"));

        SimpleAction simpleAction2 = (String name) -> {
            return "Eko";
        };

        System.out.println(simpleAction2.action("Eko"));


    }
}


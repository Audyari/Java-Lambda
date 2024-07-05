package MembuatLambda;

import PengenalanLambda.SimpleAction;

public class SimpleActionApp {

    public static void main(String[] args) {


        PengenalanLambda.SimpleAction simpleAction1 = (String value) -> {
            return "Hello " + value;
        };

        PengenalanLambda.SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };

        PengenalanLambda.SimpleAction simpleAction3 = (String value) -> "Hello " + value;

        PengenalanLambda.SimpleAction simpleAction4 = (value) -> "Hello " + value;

        SimpleAction simpleAction5 = value -> "Hello " + value;

    }
}


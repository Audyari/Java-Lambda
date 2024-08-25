package PROBLEMSOLVING.EMPAT.MethodReference;

import java.util.function.Function;

public class MethodReferenceExample {

    public static void main(String[] args) {

        // Contoh 1: Method Reference ke konstruktor
        Function<String, Integer> parseInteger = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        };

        int result = parseInteger.apply("42");
        System.out.println(result); // Output: 42

        // Contoh 2: Method Reference ke metode statis
        Function<String, Integer> parseInt = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        };

        result = parseInt.apply("24");
        System.out.println(result); // Output: 24

        // Contoh 3: Method Reference ke metode instance
        Person person = new Person("Audyari Wiyono");
        Function<Person, String> getName = new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                return person.getName();
            }
        };


        String name = getName.apply(person);
        System.out.println(name); // Output: John Doe

    }

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

package PROBLEMSOLVING.Tujuh.LambdadiOptional;

public class ContohSatuNullPointerException {

    public static void main(String[] args) {

        sayHellow("ASEP");

        try {
            sayHellow(null);
        } catch (NullPointerException e) {
            System.out.println("NILAI NYA NULL");
        }
    }

    public static void sayHellow(String name) {
        String upperName = name.toUpperCase();
        System.out.println("HIII" + upperName);
    }
}

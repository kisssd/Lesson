public class MyFirstProgram {
    public static void main(String[] args) {
        byte number = 123;
        short number2 = 10000;
        int number3 = 100000;
        long number4 = 32325454545454l;
        char myCharacter = 'a';
        float myFlout = 145.5454f;
        double myDouble = 214.54544;
        boolean isTrue = false;

        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(myCharacter);
        System.out.println(myFlout);
        System.out.println(myDouble);
        System.out.println(isTrue);

        String poemLine1 = "Tedd a kezed\n" +
                "homlokomra,\n" +
                "mintha kezed\n" +
                "kezem volna.";
        String poem2Line2 = "Úgy szeress, mint\n" +
                "ha jó volna,\n" +
                "mintha szívem\n" +
                "szíved volna.";

        System.out.println(poemLine1);
        System.out.println(poem2Line2);

        String divid = "---+---+-------+---+------+-----+----+---";
        String name = "Nagy Csongor";
        int age = 31;
        String email = "asds@gmail.com";
        String phone = "06 30 548597";
        String Linked = "fdsfdsf";

        System.out.println(divid);
        System.out.println("Name: " + name);
        System.out.println(divid);
        System.out.println("Age: " + age);
        System.out.println(divid);
        System.out.println("E-mail: " + email);
        System.out.println(divid);
        System.out.println("Phone: " + phone);

        System.out.println(false && false);
    }
}

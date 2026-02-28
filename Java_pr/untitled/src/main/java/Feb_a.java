// komment
public class Feb_a { // osztály mindig nagy betuvel kezdodik

    // mezők field csak fieldeknek van automatikus inicializálása
    static int value; // osztályszintü változó van alapértelmezett érték
    int value2 = 0; // példnyszintú változó
    static char someImportentValue;
    static boolean isfalse;
    static String myFirstString;

    public static void main(String[] args) { // Metodus kis betüvel kezdődik egy osztályon belül nem lehet 2 main metodus

        // arg paraméter változó
        { int x = 67;} // lokális változó a szögletes zárójelen belül
        System.out.println(value);
        //System.out.println(value2); fordítási idejú hibát okoz static metoduson belül csak staic metodus lehet

        System.out.println("wwwwwwww1");
        System.out.println("wwwwwwww2");
        System.out.println("wwwwwwww3");
        System.out.println("wwwwwwww4");
        System.out.println("wwwwwwww5");
        System.out.println("wwwwwwww6");
        //Ctrl + alt + l
        // sout
        // ctrl shift fel
        // ctrl y sort töröl
        // ctrl + / sorok kikommentelése
        // ctrl + shift right
        // shift F6 Rename

        long y = 123;
        char ch = 'y';
        char ch2 = '\u0020';
        char ch3 = '\u2022';
        System.out.print("fdsffd");
        System.out.print(ch2);
        System.out.println("sdfdsf");
        System.out.println(ch3);

        // primitive types
        byte number = 123;
        short number2 = 10000;
        int number3 = 100000;
        long number4 = 32325454545454l;
        char myCharacter = 'a';
        float myFlot = 145.5454f;
        double myDouble = 214.54544;
        boolean isTrue = false;

        int someValue = Integer.MAX_VALUE;

        System.out.println(someImportentValue);
        double d3 = 37d;
        System.out.println(d3);
        System.out.println(isfalse);
        System.out.println(myFirstString);

        int something  = 15_454_457;
        int something2 = 2_45_48;
        System.out.println(something); // 15454457
        System.out.println(something2); // 24548
        long someting3 = 2_326_464_564L;
        System.out.println(someting3);
        System.out.println(args.toString());

        // Variable scopes
        // osztályszintű változók static field
        // példányszintű változók
        // paraméterszintű változó
        // lokális változó

        //
    }


}

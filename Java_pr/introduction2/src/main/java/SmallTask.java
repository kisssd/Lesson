import java.math.BigDecimal;
import java.util.Scanner;

public class SmallTask {
    public static void main(String[] args) {
//        //1.
//        Double number = 0.1;
//        Double number2 = 0.2;
//        Double sum = number + number2;
//        BigDecimal correctedNumber = BigDecimal.valueOf(number).add(BigDecimal.valueOf(number2));
//        System.out.println(correctedNumber);
//        System.out.println(sum);
//
//        //2
//
//        System.out.println("Please ente number1");
//        int scannernumber1 = new Scanner(System.in).nextInt();
//
//        System.out.println("Please ente number2");
//        int scannernumber2 = new Scanner(System.in).nextInt();
//
//        System.out.println("Please ente number3");
//        int scannernumber3 = new Scanner(System.in).nextInt();
//
//        if ((scannernumber1 + scannernumber2 + scannernumber3) == 180){
//            System.out.println("The sum of numbers is 180 "+ (scannernumber1 + scannernumber2 + scannernumber3));
//        } else {
//            System.out.println("The sum of numbers isnt 180 " + (scannernumber1 + scannernumber2 + scannernumber3));
//        }
//
//        //3
//        System.out.println("Please enter number4");
//        int scannernumber4 = new Scanner(System.in).nextInt();
//        if (scannernumber4 > 0) {
//            System.out.println("Number is bigger than 0");
//        } else if (scannernumber4 ==0) {
//            System.out.println("Number is 0");
//        } else {
//            System.out.println("Number less than 0");
//        }
        //4
//        System.out.println("Please enter number5");
//        int scannernumber5 = new Scanner(System.in).nextInt();
//        System.out.println("Please enter number6");
//        int scannernumber6 = new Scanner(System.in).nextInt();
//        System.out.println("Please enter number7");
//        int scannernumber7 = new Scanner(System.in).nextInt();
//        System.out.println("Please enter number8");
//        int scannernumber8 = new Scanner(System.in).nextInt();
//        if ((scannernumber5 + scannernumber6 + scannernumber7) == scannernumber8){
//            System.out.println("scannernumber5 + scannernumber6 + scannernumber7 equal scannernumber8");
//        }
//        else {
//            System.out.println("scannernumber5 + scannernumber6 + scannernumber7 not equal scannernumber8");
//        }

//        //6
//        System.out.println("Please enter number");
//        int scannernumber = new Scanner(System.in).nextInt();
//        if (scannernumber % 7 ==0){
//            System.out.println("A szám osztható 7-el");
//        } else {
//            System.out.println("A szám nem osztható 7-el");
//        }
//
//        //7
//        System.out.println("Please enter number");
//        Float scannernumber = new Scanner(System.in).nextFloat();
//        if (scannernumber * 6 > 100){
//            System.out.println("A szám 6 szorosa nagyobb mint 100");
//        } else {
//            System.out.println("A szám 6 szorosa nem nagyobb 100-nál");
////        }
//
//        System.out.println("Please type a String");
//        String text = new Scanner(System.in).nextLine();
//        System.out.println("The lenght of Text is: "+ text.length());
//
//
//        //8
//        System.out.println("Please type a String1");
//        String text1 = new Scanner(System.in).nextLine();
//        System.out.println("Please type a String2");
//        String text2 = new Scanner(System.in).nextLine();
//        System.out.println(text1.length() + text2.length());
//
//        //10
//        System.out.println("Please enter number1:");
//        Float number1 = new Scanner(System.in).nextFloat();
//
//        System.out.println("Please enter number2:");
//        Float number2 = new Scanner(System.in).nextFloat();
//
//        System.out.println(Math.max(number1, number2));
//
//        //12
//        System.out.println("Please enter number1:");
//        int number1 = new Scanner(System.in).nextInt();
//
//        System.out.println("Please enter number2:");
//        int number2 = new Scanner(System.in).nextInt();
//
//        System.out.println("Please enter number3:");
//        int number3 = new Scanner(System.in).nextInt();
//
//        if ((number1 >= number2) && (number1 >= number3)){
//            System.out.println(" number1 is the the greatest " + number1);
//        } else if ((number2 >= number1) && (number2 >= number3)){
//            System.out.println(" number2 is the the greatest " + number2);
//        } else {
//            System.out.println(" number3 is the the greatest " + number3);
//        }

        //13
        System.out.println("Please enter number1:");
        int number1 = new Scanner(System.in).nextInt();

        System.out.println("Please enter number2:");
        int number2 = new Scanner(System.in).nextInt();

        System.out.println("Please enter number3:");
        int number3 = new Scanner(System.in).nextInt();

        if ((number1 > number2) && (number1 > number3)){
            System.out.println(" number1 is the the greatest " + number1);
        } else if ((number2 > number1) && (number2 > number3)){
            System.out.println(" number2 is the the greatest " + number2);
        } else if ((number3 > number1) && (number3 > number2)){
            System.out.println(" number3 is the the greatest " + number3);
        } else if ((number1 == number2) && (number1 > number3)){
            System.out.println(" number1 and number2  is the the greatest " + number1);
        }   else if ((number1 == number3) && (number1 > number2)){
        System.out.println(" number1 and number3 is the the greatest " + number1);
       }  else if ((number2 == number3) && (number2 > number1)){
            System.out.println(" number2 and number3 is the the greatest " + number2);
        } else if ((number1 == number2) && (number2 == number3)){
            System.out.println(" number1 and number2 and number3 is the the greatest " + number2);
        }

        // java text block
        System.out.println("""
                asdsafsdf,
                sdfsdfsdfsdf,
                sdfsadfsdf,
                dsfsdfsdafsdf,
                """);



    }
}

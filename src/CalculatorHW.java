import java.io.InputStream;
import java.util.Scanner;
import static java.util.Scanner.*;

public class CalculatorHW {
    private static float Sum;       //Diese Werte kann man als normale Variablen anlegen
    private static int x, y;
    private static int choiceNum;
    //private static double choiceNum;
    private static boolean terminate = false;
    private static String calculation;


    public static int Information() {
        Scanner info = new Scanner(System.in);
        System.out.println("""
                    You can make the following calculations :
                    1.   addition
                    2.   subtraction
                    3.   divide
                    4.   modulo
                    5.   pythagoras you can calculate the hypotenuse c

                    To select a calculation please press the corresponding number.
                    """);
        return choiceNum;
}



    public static void main(String[] args) {

        do {
            System.out.println("How's about a floating point calculation? Type f for YES");
            Scanner scanner = new Scanner(System.in);
            String floating = scanner.nextLine();

            if (floating.equals("f")) {
                System.out.println("you have decided to take floating numbers");
                System.out.println("Please choose a number");
                float x = scanner.nextFloat();
                System.out.println("Please choose a second number");
                float y = scanner.nextFloat();
                System.out.println("""
                    You can make the following calculations :
                    1.   addition
                    2.   subtraction
                    3.   divide
                    4.   modulo
                    5.   pythagoras you can calculate the hypotenuse c

                    To select a calculation please press the corresponding number.
                    """);

               int choiceNum = scanner.nextInt();


                switch (choiceNum) {    //Switch in eine Methode setzen
                    case 1:
                        Sum = x + y;
                        System.out.println("the sum of your numbers is: " + Sum);
                        break;
                    case 2:
                        // case 2 sub
                        Sum = x - y;
                        System.out.println("the sum of your subtracted numbers is: " + Sum);
                        break;
                    case 3:
                        Sum = x / y;
                        System.out.println("the sum of your divided numbers is: " + Sum);
                        break;
                    case 4:
                        Sum = x % y;
                        System.out.println("the sum of your numbers is: " + Sum);
                        break;
                    case 5:
                        double h = (Math.pow(x, 2)) + (Math.pow(y, 2));
                        System.out.println("the Sum of the hypothenuse  is: " + h);
                        break;
                    /*default:
                        throw new IllegalStateException("Unexpected value: " + choiceNum);*/
                }
                System.out.println("you decided to calculate with full numbers!");

            } else{
                // input values without floating , user NOT typed f
                Scanner inputVal = new Scanner(System.in);
                System.out.print("Please choose a number");
                x = inputVal.nextInt();
                System.out.print("Please choose a second number");
                y = inputVal.nextInt();
                System.out.println("""
                    You can make the following calculations :
                    1.   addition
                    2.   subtraction
                    3.   divide
                    4.   modulo
                    5.   pythagoras you can calculate the hypotenuse c

                    To select a calculation please press the corresponding number.
                    """);

                int choiceNum = scanner.nextInt();


                    switch (choiceNum) {   //Switch in eine Methode setzen
                        case 1:
                            System.out.println("I am doing a Addition for you ");
                            Sum = x + y;
                            System.out.println("the sum of your numbers is: " + Sum);
                            break;
                        case 2:
                            // case 2 sub
                            Sum = x - y;
                            System.out.println("the sum of your subtracted numbers is: " + Sum);
                            break;
                        case 3:
                            Sum = x / y;
                            System.out.println("the sum of your divided numbers is: " + Sum);
                            break;
                        case 4:
                            Sum = x % y;
                            System.out.println("the sum of your numbers is: " + Sum);
                            break;
                        case 5:
                            double h = (Math.pow(x, 2)) + (Math.pow(y, 2));
                            System.out.println("the Sum of the hypothenuse  is: " + h);
                            break;
                    }
                }
                Scanner inputChoice = new Scanner(System.in);
                System.out.println("Do you want to calculate again? Press the key y");
                String yes = inputChoice.nextLine();
                // System.out.println("es geht "+ yes);

                if (yes.equals("y")) {
                    terminate = false; // terminate = true (Nur true Werter laufen in if Anwendungen
                } else {
                    terminate = true;
                }

            }
            while (!terminate) ;
        }
    }




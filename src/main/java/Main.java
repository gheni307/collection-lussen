import java.util.Scanner;

public class Main {

    public static Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    public static String[] alphabetic = {"een", "twee", "drie", "veer", "vijf", "zes", "zeven", "acht", "negen", "nul"};

    public static void main(String[] args) {
        Translator translator = new Translator(numeric, alphabetic);
        boolean play = true;
        String ongeldig = "ongeldige invoer";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Als u uit van het programma wil, dan klik aan x. Als u vertalen van 0 t/m 9 wil, dan klik aan v.");
        while (play){
            String input = scanner.nextLine();
            if (input.equals("x")){
                play = false;
            } else if (input.equals("v")){
                System.out.println("klik aan uw favoriete getal om te vertalen.");
                int number = scanner.nextInt();
                if (number < 10){
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                    System.out.println("Als u verder wil gaan, dan klik nog aan v. Als u uit van het programma wil, dan klik aan x.");
                } else {
                    System.out.println(ongeldig);
                }
            }
        }


    }

}

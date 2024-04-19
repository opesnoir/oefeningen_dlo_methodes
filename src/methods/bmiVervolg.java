package methods;

import java.util.Scanner;

public class bmiVervolg {


    public static double bmiBerekenen(int lengteInput, double gewichtInput) {
        double lengteInMeters = lengteInput / 100.0;

        return Math.round(10 * gewichtInput / Math.pow(lengteInMeters, 2)) / 10.0; //math round afronden, math pow: eerste input is de base en de tweede input is de exponent
    }

    public static String bmiConclusie(double uitkomstBmi) {
        String categorie;
        double ondergewichtGrens = 18.5;
        double gezondgewichtGrens = 25.0;
        double obesitasGrens = 30.0;


        if (uitkomstBmi < ondergewichtGrens) {
            categorie = " u heeft ondergewicht";
        } else if (uitkomstBmi < gezondgewichtGrens && uitkomstBmi > ondergewichtGrens) {
            categorie = " u heeft gezondgewicht";
        } else if (uitkomstBmi < obesitasGrens && uitkomstBmi > gezondgewichtGrens) {
            categorie = " u heeft overgewicht";
        } else {
            categorie = " u heeft obesitas";
        }
        return categorie;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lengteInput;
        double gewichtInput;
        double uitkomstBmi;

        System.out.println("Geef je lengte in centimeters: ");
        lengteInput = input.nextInt();
        System.out.println("Geef je gewicht in kilogram :");
        gewichtInput = input.nextDouble();
        uitkomstBmi = bmiBerekenen(lengteInput, gewichtInput);
        System.out.println("Jouw BMI is: " + uitkomstBmi);
        // de conclusie printen
        System.out.println(bmiConclusie(uitkomstBmi));

    }
}

package ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        float glicose = scan.nextFloat();

        Main.lvGlicose(glicose);

        scan.close();
    }

    public static void lvGlicose(float glicose) {
        String classif = "";

        if (glicose <= 100) {classif = "Normal";}

        else if (glicose > 140) { classif = "Diabetes"; }

        else { classif = "Elevado";}

        System.out.println("Classificação: " + classif);
    }
}


package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Qual tabuada vc deseja saber? ");
        int x = ent.nextInt();

        Calculadora calc = new Calculadora(x);

        calc.tabuada();

        ent.close();
    }
}
    


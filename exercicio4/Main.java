package exercicio4;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        boolean running = true;

        do {
            System.out.println("Me informe 2 números: ");
            int x = ent.nextInt();
            int y = ent.nextInt();
            
            String ordem = "DECRESCENTE!";
            if (x < y) {
                ordem = "CRESCENTE!";
            } 
            if (x == y) {
                ordem = "IGUAIS!";
            }

            System.out.println(ordem);
        } while (running);

        ent.close();
    }
} 
    

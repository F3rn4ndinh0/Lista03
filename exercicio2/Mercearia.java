package exercicio2;

import java.util.Scanner;

public class Mercearia {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        float preco = ent.nextFloat();

        System.out.print("Quantidade comprada: ");
        float quantidade = ent.nextFloat();

        System.out.print("Dinheiro recebido: ");
        float dinheiro = ent.nextFloat();

        Mercearia.troco(preco, quantidade, dinheiro);

        ent.close();
    }

    public static void troco(float preco, float quantidade, float dinheiro) {
        float valor = preco * quantidade;
        float troco = dinheiro - valor;

        if (dinheiro >= valor) {
            System.out.printf("\nTROCO = %.2f", troco);
        }
        else { 
            System.out.println("Dinheiro insuficiente!"); 
        }
    }
} 
    


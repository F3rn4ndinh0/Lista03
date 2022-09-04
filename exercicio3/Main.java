package exercicio3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa[] vetorPessoa = new Pessoa[2];

        String nome = "";
        float idade = 0;

        for (int i = 0; i < vetorPessoa.length; i++) {
            System.out.println("Dados da pessoa:");

            System.out.print("Nome: ");
            nome = scan.nextLine();

            System.out.print("Idade: ");
            idade = scan.nextInt();
            scan.nextLine();

            Pessoa p = new Pessoa(nome, idade);
            vetorPessoa[i] = p;
        }

        Pessoa.mediaIdade(vetorPessoa);

        scan.close();
    }
}

package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = ent.nextLine();

        System.out.print("Valor por hora: ");
        float valorHora = ent.nextFloat();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = ent.nextInt();

        Funcionario p = new Funcionario(nome, valorHora, horasTrabalhadas);

        p.pagamento();

        ent.close();
    }
}
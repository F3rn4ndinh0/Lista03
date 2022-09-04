package exercicio6;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int senha = 2002;
        int input = 0;
        boolean senhaCorreta = true;

        System.out.print("Informe a senha: ");
        input = scan.nextInt();

        if (input != senha ) {
            senhaCorreta = false;
        }

        while (!senhaCorreta) {
            System.out.print("Senha Inválida! Tente Novamente: ");
            input = scan.nextInt();

            if (input == senha) {
                senhaCorreta = true;
            }
        }

        System.out.println("Acesso permitido!");

        scan.close();
    }
}
    


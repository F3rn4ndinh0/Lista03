package exercicio5;

public class Calculadora {
    
    private int valor;

    public Calculadora(int valor) {
        this.valor = valor;
    }

    public void tabuada() {
        for (int i = 1; i <= 10; i++) {
            int result = this.valor * i;

            System.out.printf("\n%d x %d = %d", this.valor, i, result);
        }
    }
} 
    


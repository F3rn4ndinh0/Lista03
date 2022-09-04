package ex08;

public class Empregado {
    
    private String nome;
    private double SalarioBruto;
    private double imposto;

    public Empregado(String nome, double SalarioBruto, double imposto) {
        this.nome = nome;
        this.SalarioBruto = SalarioBruto;
        this.imposto = imposto;
    }

    public double buscasSalarioLiquido() {
        double salarioLiquido = this.SalarioBruto - this.imposto;
        return salarioLiquido;
    }

    public void aumentarSalario(double porcentagem) {
        this.SalarioBruto += this.SalarioBruto * porcentagem / 100;
    }

    public String getNome() { return nome; }

    public double getSalarioBruto() { return SalarioBruto; }

    public double getImposto() { return imposto; }
 
}
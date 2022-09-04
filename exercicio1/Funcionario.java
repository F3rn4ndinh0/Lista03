package exercicio1;

public class Funcionario {

    private String Nome;
    private float VlrHora;
    private int horasTrabalhadas;

    public Funcionario(String Nome, float VlrHora, int horasTrabalhadas) {
        this.Nome = Nome;
        this.VlrHora = VlrHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void pagamento() {
        float pagamento = this.VlrHora * this.horasTrabalhadas;

        System.out.printf("O pagamento para %s deve ser %.2f", this.Nome, pagamento);
    }
}
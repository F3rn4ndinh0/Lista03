package exercicio3;

public class Pessoa {
    private String nome;
    private float idade;

    public Pessoa(String nome, float idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void mediaIdade(Pessoa[] p) {
        float media = ( p[0].getIdade() + p[1].getIdade() ) / p.length;

        System.out.printf("A idade média de %s e %s é de %.1f anos", p[0].getNome(), p[1].getNome(), media);
    }

    public String getNome() { return nome; }

    public float getIdade() { return idade; }

}
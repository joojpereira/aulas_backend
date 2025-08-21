public class Produto {
    String nome;
    int quantidade;
    int preco;


    public Produto() {
        this.nome = "Sem nome";
        this.quantidade = 0;
        this.preco = 0;
    }


    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }


    public Produto(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibir() {
        System.out.println("O produto " + nome + " que tem preço " + preco + " tem quantidade " + quantidade);
    }
}
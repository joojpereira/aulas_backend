public class ProdutoTest {
    public static void main(String[] args) {

        Produto produto1 = new Produto("teste1", 10);
        Produto produto2 = new Produto("teste1", 10, 20);
        Produto produto3 = new Produto();


        produto1.exibir();
        produto2.exibir();
        produto3.exibir();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        var produto = new Produto("Caneta", 5.99);
        System.out.println(produto.toString());

        var eletronico = new Eletronico("Celular", 1250.99, "Lg", "S-980");
        System.out.println(eletronico.toString());

        var livro = new Livro("Amizade ok", 720.99, "Cleber");
        System.out.println(livro.toString());
    }
}

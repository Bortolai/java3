public class Main {
    public static void main(String[] args) {

        var produto1 = new Produto(
                "Coca-Cola", 5.0, "Refrigerante de cola", 10);
        var produto2 = new Produto(
                "Guaraná", 4.0, "Refrigerante de guaraná", 5);
        var produto3 = new Produto("Fanta", 4.0, "Refrigerante de fanta", 8);

        produto1.AdicionarEstoque(5);
        System.out.println(produto1);
    }
}
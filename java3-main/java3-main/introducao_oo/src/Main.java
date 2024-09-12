public class Main {
    public static void main(String[] args) {

        var produto1 = new Produto(
                "Coca-Cola", 5.0, "Refrigerante de cola", 10);
        var produto2 = new Produto(
                "Guaraná", 4.0, "Refrigerante de guaraná", 5);
        var produto3 = new Produto("Fanta", 4.0, "Refrigerante de fanta", 8);

        var produto4 = new Produto("Fanta kiw", 0, null, 0);

        produto4.setNome("Fanta Kiwi");
        produto4.setDescricao("Refrigerante de Kiwi");

        var produto5 = new Produto();
        produto5.setNome("Sprite");
        produto5.AdicionarEstoque(10);

        System.out.println(produto4.getNome());

        produto1.AdicionarEstoque(-5);
        System.out.println(produto5);

        var numero = 10;
        if (numero == 10)
            System.out.println("Número é igual a 10");

        var texto = "teste";
        if (texto.equals("teste"))
            System.out.println("Texto é igual a teste");

        var produto6 = new Produto();

        if (produto6.equals(produto4))
            System.out.println("Os produtos são iguais");
        else
            System.out.println("Os produtos são diferentes");

        var produtoFisico1 = new ProdutoFisico();
                produtoFisico1.setNome("Elden Ring - Mídia Física - PS4");
                produtoFisico1.setPreco(200.00);
                produtoFisico1.setDescricao("Mídia física do jogo Elden Ring para PS4");
    }
}
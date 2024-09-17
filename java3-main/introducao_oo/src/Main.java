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

        var produtoFisico1 = new ProdutoFisico();
                produtoFisico1.setNome("Elden Ring - Mídia Física - PS4");
                produtoFisico1.setPreco(200.00);
                produtoFisico1.setDescricao("Mídia física do jogo Elden Ring para PS4");

        produtoFisico1.setDimensao(new Dimensao(20,20,20));
        produtoFisico1.getCaracteristicas().add(
                new Caracteristicas("Plataforma", "PS4"));
        produtoFisico1.getCaracteristicas().add(
                new Caracteristicas("Distribuídora", "From Software"));
        System.out.println(produtoFisico1);
    }
}



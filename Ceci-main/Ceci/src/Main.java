public class Main {
    public static void main(String[] args) {

        var usuario1 = new Usuario("Beatriz", "beatriz.bortolai@gmail.com", "517.464.818-38", "AF42578");
        var usuario2 = new Usuario("Bárbara", "barbarabonome@gmail.com", "819.312.454-61", "5621aAD");

        var linha04 = new LinhaMetro(4, "Amarela", "Luz");
        var linha05 = new LinhaMetro(5,"Lilás","Capão Redondo");
        var linha08 = new LinhaMetro(8,"Diamante","Júlio Prestes");
        var linha09 = new LinhaMetro(9,"Esmeralda","Santo Amaro");

        var funcionario01 = new Funcionario("Roberto", "Segurança", 37, 3.000);
        var funcionario02 = new Funcionario("Aline", "Analista de dados", 40, 4.500);

        var trem01 = new TremDeMetro(2000, 1200, "1 Azul");

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(linha04);
        System.out.println(linha05);
        System.out.println(linha08);
        System.out.println(linha09);
        System.out.println(funcionario01);
        System.out.println(funcionario02);
        System.out.println(trem01);
    }
}

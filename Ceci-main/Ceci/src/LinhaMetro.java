public class LinhaMetro {
    private int linha;
    private String cor;
    private String estacao;

    //constructor vazio
    public LinhaMetro() {
    }

    //constructor completo
    public LinhaMetro(int linha, String cor, String estacao) {
        this.linha = linha;
        this.cor = cor;
        this.estacao = estacao;

    }

    @Override
    public String toString() {
        return "Linha " + linha +
                "-" + cor +
                " Estação: " + estacao;
    }
}

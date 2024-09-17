public class TremDeMetro {
    //Atributos
    private int capacidade;
    private int passageirosAtuais;
    private String linha;

    //constructor vazio
    public TremDeMetro() {
    }

    //constructor completo
    public TremDeMetro(int capacidade, int passageirosAtuais, String linha) {
        this.capacidade = capacidade;
        this.passageirosAtuais = passageirosAtuais;
        this.linha = linha;
    }

    @Override
    public String toString() {
        return "Trem: " +
                "Capacidade total = " + capacidade +
                ", passageiros atuais = " + passageirosAtuais +
                ", linha-" + linha;
    }
}

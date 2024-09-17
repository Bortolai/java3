import java.util.ArrayList;
import java.util.Objects;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private String descricao;
    private int quantidade;
    private ArrayList<Caracteristicas> caracteristicas = new ArrayList<>();

    //Constructor Vazio
    public Produto() {
    }

    //Constructor Intermediário
    public Produto(String nome, double preco, String descricao, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    //Constructor Completo
    public Produto(String nome, double preco, String descricao, int quantidade, ArrayList<Caracteristicas> caracteristicas) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.caracteristicas = caracteristicas;
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Caracteristicas> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<Caracteristicas> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    //Métodos ou Funções
    public void AdicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void RemoverEstoque(int quantidade){
        if(this.quantidade - quantidade < 0)
            System.out.println("Quantidade insuficiente em estoque");
        else
            this.quantidade -= quantidade;
    }

    //Método equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(getPreco(), produto.getPreco()) == 0 && quantidade == produto.quantidade && Objects.equals(getNome(), produto.getNome()) && Objects.equals(getDescricao(), produto.getDescricao()) && Objects.equals(getCaracteristicas(), produto.getCaracteristicas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPreco(), getDescricao(), quantidade, getCaracteristicas());
    }

    //Método toString
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", caracteristicas=" + caracteristicas +
                '}';
    }
}



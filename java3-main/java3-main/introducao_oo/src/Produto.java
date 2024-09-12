import java.util.Objects;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private String descricao;
    private int quantidade;

    //Constructor Vazio
    public Produto() {
    }

    //Constructor Completo
    public Produto(String nome, double preco, String descricao, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
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

    //Método toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Double.compare(preco, produto.preco) == 0 && quantidade == produto.quantidade && Objects.equals(nome, produto.nome) && Objects.equals(descricao, produto.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, descricao, quantidade);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}


public class Funcionario {
    //Atributos
    private String nome;
    private String cargo;
    private int idade;
    private double salarioMensal;

    //constructor vazio
    public Funcionario() {
    }

    //constructor completo
    public Funcionario(String nome, String cargo, int idade, double salarioMensal) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salarioMensal = salarioMensal;
    }

    @Override
    public String toString() {
        return "Funcionário: " +
                "nome = '" + nome + '\'' +
                ", cargo = " + cargo +
                ", idade = " + idade +
                ", salário = " + salarioMensal;
    }
}

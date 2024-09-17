public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    //constructor vazio
    public Usuario() {
    }

    //constructor completo
    public Usuario(String nome, String email, String cpf, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuário: " +
                "nome = '" + nome + '\'' +
                ", e-mail = " + email +
                ", CPF = " + cpf +
                ", senha = " + senha;
    }
}

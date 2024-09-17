public class BancoDeDados {
    //Atributos
    private String url;
    private String usuario;
    private String senha;
    private boolean conectado;

    //constructor vazio
    public BancoDeDados() {
    }

    //constructor completo
    public BancoDeDados(String url, String usuario, String senha, boolean conectado) {
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
        this.conectado = false;
    }

    @Override
    public String toString() {
        return "BancoDeDados{" +
                "url='" + url + '\'' +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", conectado=" + conectado +
                '}';
    }
}

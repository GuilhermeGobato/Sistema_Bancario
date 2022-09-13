package entidades;
import entidades.ContaBancaria;
public class Pessoa {
    private String nome;
    private int cpf;
    private String genero;
    private int senha;

    public Pessoa(String nome, int cpf, String genero, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.senha = senha;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", genero='" + genero + '\'' +
                 '\'' +  "senha= "+ senha
                + "}";
    }
}

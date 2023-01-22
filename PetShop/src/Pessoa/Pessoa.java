package Pessoa;
import Endereco.Endereco;

public class Pessoa {
    public Pessoa(String nome, String cpf, String email, Endereco endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    String nome;
    String cpf;
    String email;
    Endereco endereco;
    String telefone;
}

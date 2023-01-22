package Pessoa;

import Endereco.Endereco;

import java.math.BigDecimal;
import java.util.Date;

public class Funcionario extends Pessoa{
    int id;

    public Funcionario(String nome, String cpf, String email, Endereco endereco, String telefone, int id, Cargo cargo, BigDecimal salario, Date admissao, Date desligamento) {
        super(nome, cpf, email, endereco, telefone);
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
        this.admissao = admissao;
        this.desligamento = desligamento;
    }

    Cargo cargo;
    BigDecimal salario;
    Date admissao;
    Date desligamento;
}

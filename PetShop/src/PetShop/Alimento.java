package PetShop;

import java.math.BigDecimal;

public class Alimento implements Comparable{
    private int id;
    private String nome;
    private BigDecimal preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Alimento(int id, String nome, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Alimento { " +
                "id = " + id +
                ", nome = '" + nome + '\'' +
                ", preco = " + preco +
                '}';
    }

    @Override
    public int compareTo(Object other) {
        Alimento alimento = (Alimento) other;
        if (this.id < alimento.id){
            return -1;
        }
        if (this.id > alimento.id) {
            return 1;
        }
        return 0;
    }
}

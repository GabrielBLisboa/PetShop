package PetShop;

import java.math.BigDecimal;

public class Remedio implements Comparable{
    @Override
    public String toString() {
        return "Remedio{" +
                " id = " + id +
                ", nome = '" + nome + '\'' +
                ", preco = " + preco +
                '}';
    }
    @Override
    public int compareTo(Object other) {
        Remedio remedio = (Remedio) other;
        if (this.id < remedio.id){
            return -1;
        }
        if (this.id > remedio.id) {
            return 1;
        }
        return 0;
    }

    public Remedio(int id, String nome, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

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

    private int id;
    private String nome;
    private BigDecimal preco;
}

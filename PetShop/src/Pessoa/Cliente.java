package Pessoa;

import Animal.Animais;
import Endereco.Endereco;


import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    public Cliente(String nome, String cpf, String email, Endereco endereco, String telefone, int id, List<Animais> pets) {
        super(nome, cpf, email, endereco, telefone);
        this.id = id;
        this.pets = pets;
    }

    int id;

    public List<Animais> getPets() {
        return pets;
    }

    public void setPets(List<Animais> pets) {
        this.pets = pets;
    }

    List<Animais> pets;

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                "\npets=" + pets +
                '}';
    }
    public static Cliente criaCliente1(Animais ramon, Animais matilda){
        ArrayList<Animais> petsDaBabs = new ArrayList<>();
        petsDaBabs.add(0,ramon);
        petsDaBabs.add(1, matilda);
        return new Cliente("Bárbara", "123.456.789-01", "bibos@ggg.com",
                Endereco.retornaEndereco(101), "98767-5432", 101, petsDaBabs);
    }
    public static Cliente criaCliente2(Animais dori){
        ArrayList<Animais> petsDaCrodes = new ArrayList<>();
        petsDaCrodes.add(0,dori);
        return new Cliente("Cláudia", "098.765.432-10", "crodes@ggg.com",
                Endereco.retornaEndereco(102), "9123-4567", 102, petsDaCrodes);
    }

}

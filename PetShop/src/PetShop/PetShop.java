package PetShop;
import Endereco.Endereco;
import ListaEObjetos.Listas;
import Pessoa.Cliente;
import Animal.*;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PetShop {
    public PetShop(String cnpj, Endereco endereco) {
        this.cnpj = cnpj;
        this.endereco = endereco;
    }
    String cnpj;
    Endereco endereco;

    public static void verRemedios(){
        ArrayList<Remedio> remediosEmEstoque = Listas.criaListaRemedios();
        remediosEmEstoque.forEach(System.out::println);
        }

    public static void verAlimentos(){
        ArrayList<Alimento> alimentosEmEstoque = Listas.criaListaAlimentos();
        for (Alimento alimento : alimentosEmEstoque){
            System.out.println(alimento);
        }
    }

    public static ResponseVO atendimentoClinico(Cliente cliente){
        List<Animais> listaTemp = cliente.getPets();
        for (Animais pet: listaTemp){
            pet.setObservacao("Tomar a vacina número 3");
        }
        return new ResponseVO(Servicos.ATENDIMENTO_CLINICO.getId(), Servicos.ATENDIMENTO_CLINICO, Servicos.ATENDIMENTO_CLINICO.getValor(), cliente);
    }
    public static ResponseVO vacinacao(Cliente cliente){
        List<EsquemaVacinal> vacinasTemp = EsquemaVacinal.retornaEsquemaVacinal("AC");;
        List<Animais> listaTemp = cliente.getPets();
        for (Animais pet: listaTemp){
            pet.setVacinas(vacinasTemp);
            pet.setObservacao("Vacina APLICADA");
        }
        return new ResponseVO(Servicos.VACINCAO.getId(), Servicos.VACINCAO, Servicos.VACINCAO.getValor(), cliente);
    }

    public static ResponseVO higienizar(Cliente cliente, String tipoDeHigiene){
        List<Animais> listaTemp = cliente.getPets();
        for (Animais pet: listaTemp){
            switch (tipoDeHigiene) {
                case "banho" -> pet.setEstado(EstadoAnimal.LIMPO);
                case "tosa" -> pet.setEstado(EstadoAnimal.TOSADO);
                case "banho e tosa" -> pet.setEstado(EstadoAnimal.LIMPO_E_TOSADO);
            }
        }
        return new ResponseVO(Servicos.BANHO.getId(), Servicos.BANHO, Servicos.BANHO.getValor(), cliente);
    }
    public static BigDecimal pagamento(Integer[] ids, Alimento alimento, Remedio remedio){
        BigDecimal valorTemp = new BigDecimal("0");
        BigDecimal totalValor = Servicos.retornaValorPorID(ids);
        valorTemp = alimento.getPreco();
        totalValor = totalValor.add(valorTemp);
        valorTemp = remedio.getPreco();
        totalValor = totalValor.add(valorTemp);
        return totalValor;
    }
}



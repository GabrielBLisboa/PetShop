import Animal.*;
import Endereco.Endereco;
import ListaEObjetos.CriarObjetos;
import Pessoa.Cliente;
import PetShop.*;

import java.math.BigDecimal;

import static ListaEObjetos.Listas.beneflora;
import static ListaEObjetos.Listas.racaoGolden;

public class Teste {
    public static void main(String[] args) {

//  criar o PetShop
        Endereco enderecoPetShop = Endereco.retornaEndPetShop();
        PetShop petChops = new PetShop("11.222.333/010004-55", enderecoPetShop);

//  criar animais da cliente 101
        Animais ramon = CriarObjetos.criaGato1();
        Animais matilda = CriarObjetos.criaGato2();

//  criar cliente 101 com 2 animais
        Cliente babs = Cliente.criaCliente1(ramon, matilda);

//  criar animais da cliente 101
        Animais dori = CriarObjetos.criaCachorro1();

//  criar cliente com 1 animal
        Cliente crodes = Cliente.criaCliente2(dori);

//  imprimir todos os itens de alimentos
        PetShop.verAlimentos();

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

//  imprimir todos os itens de remédios
        PetShop.verRemedios();

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

// chamada a consulta do cliente com apenas 1 pet
        ResponseVO consulta1 = PetShop.atendimentoClinico(crodes);
        System.out.println(consulta1);

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

// Tomar vacina e mudar campos vacina e observação
        ResponseVO vacinacao1 = PetShop.vacinacao(crodes);
        System.out.println(vacinacao1);

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

// Tomar banho e mudar campo Estado do Animal
        ResponseVO higienizar1 = PetShop.higienizar(crodes, "banho");
        System.out.println(higienizar1);

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

// Passar para o método pagamentos todos os ids, 1 remedio e 1 alimento e validar a soma
        BigDecimal totalAPagar = new BigDecimal("0");
        Integer[] ids = {Servicos.ATENDIMENTO_CLINICO.id, Servicos.VACINCAO.getId(), Servicos.BANHO.getId()};
        totalAPagar = PetShop.pagamento(ids, racaoGolden, beneflora);

        System.out.println("Total a pagar: " + totalAPagar);
    }

}

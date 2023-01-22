package PetShop;
import Pessoa.Cliente;
import java.math.BigDecimal;


public class ResponseVO {
    int id;
    Servicos servico;
    BigDecimal valor;
    Cliente cliente;

    public ResponseVO(int id, Servicos servico, BigDecimal valor, Cliente cliente) {
        this.id = id;
        this.servico = servico;
        this.valor = valor;
        this.cliente = cliente;
    }
    @Override
    public String toString() {
        return "ResponseVO{" +
                "id = " + id +
                ", servico = " + servico +
                ", valor = " + valor +
                ", cliente = " + cliente +
                '}';
    }



}

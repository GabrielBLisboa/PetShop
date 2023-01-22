package PetShop;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public enum Servicos {
    ATENDIMENTO_CLINICO(1, new BigDecimal("90.00")),
    VACINCAO(2, new BigDecimal("65.50")),
    BANHO(3, new BigDecimal("30.50")),
    TOSA(4, new BigDecimal("25.50")),
    BANHO_E_TOSA(5, new BigDecimal("55.00"));

    public Integer getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public static final Map<Integer, BigDecimal> servicoValor = new HashMap();

    static {
        for (Servicos e : values()) {
            servicoValor.put(e.id, e.valor);
        }
    }

    public final Integer id;
    public final BigDecimal valor;

    Servicos(Integer id, BigDecimal valor) {
        this.id = id;
        this.valor = valor;
    }

    public static BigDecimal retornaValorPorID(Integer[] id) {
        BigDecimal totalValor = new BigDecimal("0");
        BigDecimal temp;
        for (int cont : id) {
            temp = servicoValor.get(cont);
            totalValor = totalValor.add(temp);
        }
        return totalValor;
    }
}


package Animal;

import java.util.ArrayList;
import java.time.*;

public class EsquemaVacinal {

    public EsquemaVacinal(LocalDate data, Vacinas vacina, String observacao) {
        this.data = data;
        this.vacina = vacina;
        this.observacao = observacao;
    }
    LocalDate data;
    Vacinas vacina;
    String observacao;

    @Override
    public String toString() {
        return "EsquemaVacinal{" +
                "data=" + data +
                ", vacina=" + vacina +
                ", observacao='" + observacao + '\'' +
                '}';
    }

    public static ArrayList<EsquemaVacinal> retornaEsquemaVacinal(String codVacinas){

        EsquemaVacinal vacina1 = new EsquemaVacinal(LocalDate.of(2022,8,7), Vacinas.VACINA_1,"Antirábica");
        EsquemaVacinal vacina2 = new EsquemaVacinal(LocalDate.of(2022,8,7), Vacinas.VACINA_2,"Polivalente");
        EsquemaVacinal vacina3 = new EsquemaVacinal(LocalDate.of(2022,8,7), Vacinas.VACINA_3,"v6");

        ArrayList<EsquemaVacinal> esquemaVacinaTemporario = new ArrayList<>();

        if (codVacinas.contains("A")) {
            esquemaVacinaTemporario.add(vacina1);
        }
        if (codVacinas.contains("B")) {
            esquemaVacinaTemporario.add(vacina2);
        }
        if (codVacinas.contains("C")) {
            esquemaVacinaTemporario.add(vacina3);
        }
        return esquemaVacinaTemporario;
    }

}

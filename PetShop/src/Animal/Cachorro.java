package Animal;

import java.time.*;
import java.util.List;

public class Cachorro extends Animais {

    public Cachorro(String nome, LocalDate nascimento, String raca, Porte porte, Double peso, EstadoAnimal estado, List<EsquemaVacinal> vacinas, String observacao) {
        super(nome, nascimento, raca, porte, peso, estado, vacinas, observacao);
    }
    @Override
    public String toString() {
        return "Cachorro {" +
                "nome ='" + nome + '\n' +
                "nascimento=" + nascimento + '\n' +
                "raca='" + raca + '\n' +
                "porte=" + porte + '\n' +
                "peso=" + peso + '\n' +
                "estado=" + estado + '\n' +
                "vacinas=" + vacinas + '\n' +
                "observacao='" + observacao + '\n' +
                '}';
    }
}
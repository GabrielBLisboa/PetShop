package Animal;

import java.time.*;
import java.util.List;

public class Gato extends Animais {

    public Gato(String nome, LocalDate nascimento, String raca, Porte porte, Double peso, EstadoAnimal estado, List<EsquemaVacinal> vacinas, String observacao) {
        super(nome, nascimento, raca, porte, peso, estado, vacinas, observacao);
    }
}

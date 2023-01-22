package Animal;

import java.time.*;
import java.util.List;

public abstract class Animais {
    String nome;

    public Animais(String nome, LocalDate nascimento, String raca, Porte porte, Double peso,
                   EstadoAnimal estado, List<EsquemaVacinal> vacinas, String observacao) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.raca = raca;
        this.porte = porte;
        this.peso = peso;
        this.estado = estado;
        this.vacinas = vacinas;
        this.observacao = observacao;
    }

    LocalDate nascimento;
    String raca;
    Porte porte;
    Double peso;

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    EstadoAnimal estado;

    public List<EsquemaVacinal> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<EsquemaVacinal> vacinas) {
        this.vacinas = vacinas;
    }

    List<EsquemaVacinal> vacinas;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    String observacao;

    @Override
    public String toString() {
        return "Animais{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", raca='" + raca + '\'' +
                ", porte=" + porte + '\'' +
                ", peso=" + peso + '\'' +
                ", estado=" + estado + '\'' +
                ", vacinas=" + vacinas + '\'' +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}

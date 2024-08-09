package ifsc.poo.lavacao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "services")
public class Service {

    private static int pontos;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String descricao;

    @Min(0)
    private double valor;

    @Enumerated(EnumType.ORDINAL)
    @NotNull
    private ECategory category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotBlank String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NotBlank String descricao) {
        this.descricao = descricao;
    }

    @Min(0)
    public double getValor() {
        return valor;
    }

    public void setValor(@Min(0) double valor) {
        this.valor = valor;
    }

    public static int getPontos() {
        return pontos;
    }

    public static void setPontos(@Min(0) int pontos) {
        Service.pontos = pontos;
    }

}

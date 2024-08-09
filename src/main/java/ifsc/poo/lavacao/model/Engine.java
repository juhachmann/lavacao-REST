package ifsc.poo.lavacao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "engines")
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int potencia;

    @Enumerated(EnumType.ORDINAL)
    @NotNull
    private EFuelType tipoCombustivel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public EFuelType getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(EFuelType tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

}

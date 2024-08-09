package ifsc.poo.lavacao.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "models")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String descricao;

    @ManyToOne
    @NotNull @Valid
    private Brand brand;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private ECategory categoria;

    @NotNull @Valid
    @OneToOne
    @JoinColumn(unique = true)
    private Engine engine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Brand getMarca() {
        return brand;
    }

    public void setMarca(Brand brand) {
        this.brand = brand;
    }

    public ECategory getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategory categoria) {
        this.categoria = categoria;
    }

    public Engine getMotor() {
        return engine;
    }

    public void setMotor(Engine engine) {
        this.engine = engine;
    }

}

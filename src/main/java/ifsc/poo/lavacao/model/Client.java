package ifsc.poo.lavacao.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ifsc.poo.lavacao.model.exceptions.ExceptionLavacao;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "dtype")
@JsonSubTypes({
        @JsonSubTypes.Type(value = LegalEntity.class, name = "2"),
        @JsonSubTypes.Type(value = NaturalPerson.class, name = "1")
})
@Entity
@Table(name = "clients")
@DiscriminatorColumn(discriminatorType = DiscriminatorType.INTEGER)
public abstract class Client implements IClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @NotBlank
    protected String nome;

    @NotBlank
    protected String email;

    @NotBlank
    protected String celular;

    @NotNull
    protected LocalDate dataCadastro;

    @OneToMany(mappedBy = "client")
    @NotNull
    private Set<@Valid Vehicle> vehicles = new HashSet<>();

    @OneToOne(mappedBy = "client")
    @PrimaryKeyJoinColumn
    @Valid
    private Score score;

    public static ClientBuilder fromBuilder() {
        return new ClientBuilder();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Set<Vehicle> getVeiculos() {
        return vehicles;
    }

    public void setVeiculos(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Score getPontuacao() {
        return score;
    }

    public void setPontuacao(Score score) {
        this.score = score;
    }

    public void addVeiculo(Vehicle vehicle) {
        Objects.requireNonNull(vehicle);
        vehicles.add(vehicle);
    }

    public void removeVeiculo(Vehicle vehicle) {
        if(!vehicles.remove(vehicle))
            throw new ExceptionLavacao("Cliente não possui o veículo informado!");
    }


}

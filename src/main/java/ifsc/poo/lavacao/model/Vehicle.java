package ifsc.poo.lavacao.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "client_vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String placa;

    private String observacoes;

    @ManyToOne
    @NotNull @Valid
    private Model model;

    @ManyToOne
    @NotNull @Valid
    private Color color;

    @ManyToOne
    @NotNull @Valid
    private Client client;

    public Vehicle() {}

    Vehicle(VeiculoBuilder builder) {
        this.id = builder.id;
        this.placa = builder.placa;
        this.client = builder.client;
        this.color = builder.color;
        this.observacoes = builder.observacoes;
        this.model = builder.model;
    }

    public static VeiculoBuilder builder() {
        return new VeiculoBuilder();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Model getModelo() {
        return model;
    }

    public void setModelo(Model model) {
        this.model = model;
    }

    public Color getCor() {
        return color;
    }

    public void setCor(Color color) {
        this.color = color;
    }

    public Client getCliente() {
        return client;
    }

    public void setCliente(Client client) {
        this.client = client;
    }


    public static class VeiculoBuilder {

        private int id;
        private String placa;
        private String observacoes;
        private Model model;
        private Color color;
        private Client client;

        public VeiculoBuilder id(int id) {
            this.id = id;
            return this;
        }

        public VeiculoBuilder placa(String placa) {
            this.placa = placa;
            return this;
        }

        public VeiculoBuilder observacoes(String observacoes) {
            this.observacoes = observacoes;
            return this;
        }

        public VeiculoBuilder modelo(Model model) {
            this.model = model;
            return this;
        }

        public VeiculoBuilder cor(Color color) {
            this.color = color;
            return this;
        }

        public VeiculoBuilder cliente(Client client) {
            this.client = client;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }

    }

}

package ifsc.poo.lavacao.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "items_so")
public class ItemSO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @NotNull @Valid
    private Service service;

    @NotNull
    private double valorServico;

    private String observacoes;

    public ItemSO() {
    }

    public Service getServico() {
        return service;
    }

    public void setServico(Service service) {
        this.service = service;
        this.valorServico = this.service.getValor();
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

}

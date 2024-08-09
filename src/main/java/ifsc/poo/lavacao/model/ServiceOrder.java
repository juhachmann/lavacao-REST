package ifsc.poo.lavacao.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "service_orders")
public class ServiceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double desconto;

    @NotNull
    private Date agenda;

    @OneToMany
    private List<@Valid ItemSO> items = new ArrayList<>();

    @ManyToOne
    @NotNull @Valid
    private Vehicle vehicle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Date getAgenda() {
        return agenda;
    }

    public void setAgenda(Date agenda) {
        this.agenda = agenda;
    }

    public List<ItemSO> getItems() {
        return items;
    }

    public void setItems(List<ItemSO> items) {
        this.items = items;
    }



    // TODO Esses métodos não correspondem a um atributo do banco
    //  => como o Data REST vai lidar com ele?
    public double getTotal() {
        return calcularServico() - desconto;
    }

    public double calcularServico() {
        double servico = 0.0;
        for(ItemSO itemSO : items) {
            servico += itemSO.getValorServico();
        }
        return servico;
    }

    // TODO Isso aqui não sei se vai fazer sentido no backend!
    public void add(ItemSO itemSO) {
        this.items.add(itemSO);
    }

    // TODO Ver comentário de add
    public void remove(ItemSO itemSO) {
        this.items.remove(itemSO);
    }

}

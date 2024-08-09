package ifsc.poo.lavacao.model;

import ifsc.poo.lavacao.model.exceptions.ExceptionLavacao;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "client_scores")
public class Score {

    @Id
    @Column(name = "user_id", insertable = false)
    private int id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    @NotNull @Valid
    private Client client;

    @Min(0)
    private int quantidade = 0;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    // TODO Aqui tem lógica de Negócio, ver onde inserir!
    public int adicionar(int valor) {
        validarValor(valor);
        this.quantidade += valor;
        return saldo();
    }

    public int subtrair(int valor) {
        validarValor(valor);
        if((saldo() - valor) < 0) {
            throw new ExceptionLavacao("Quantidade de pontos a subtrair é maior do que o saldo de pontuação do cliente. Máximo a subtrair: " + saldo());
        }
        this.quantidade -= valor;
        return saldo();
    }

    public int saldo() {
        return quantidade;
    }

    private void validarValor(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser um valor negativo");
        }
    }

    @Override
    public String toString() {
        return Integer.toString(quantidade);
    }

}

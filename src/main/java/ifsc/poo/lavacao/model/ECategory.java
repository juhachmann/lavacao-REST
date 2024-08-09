package ifsc.poo.lavacao.model;

public enum ECategory {

    SMALL("Pequeno"),
    MEDIUM("Médio"),
    LARGE("Grande"),
    MOTOCYCLE("Moto"),
    DEFAULT("Padrão");

    private String nome;

    ECategory(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}

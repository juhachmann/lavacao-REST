package ifsc.poo.lavacao.model;

public enum EFuelType {

    GAS("Gasolina"),
    ETHANOL("Etanol"),
    FLEX("Flex"),
    DIESEL("Diesel"),
    GNV("GNV"),
    OTHER("Outro");

    private String nome;

    EFuelType(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}

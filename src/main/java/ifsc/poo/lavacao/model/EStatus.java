package ifsc.poo.lavacao.model;

public enum EStatus {

    OPEN ("aberta"),
    CLOSED ("fechada"),
    CANCELLED ("cancelada");

    private final String name;

    EStatus(String name) {
        this.name = name;
    }

    public String getName(EStatus status) {
        return status.name;
    }

}

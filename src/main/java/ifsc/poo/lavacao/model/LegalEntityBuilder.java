package ifsc.poo.lavacao.model;

public class LegalEntityBuilder {

    private ClientBuilder clientBuilder;
    private String cnpj;
    private String inscricaoEstadual;

    LegalEntityBuilder(ClientBuilder clientBuilder) {
        this.clientBuilder = clientBuilder;
    }

    public LegalEntityBuilder setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public LegalEntityBuilder setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
        return this;
    }

    public LegalEntity build() {
        LegalEntity pj = new LegalEntity();
        pj.setNome(clientBuilder.nome);
        pj.setEmail(clientBuilder.email);
        pj.setCelular(clientBuilder.celular);
        pj.setDataCadastro(clientBuilder.dataCadastro);
        pj.setInscricaoEstadual(inscricaoEstadual);
        pj.setCnpj(cnpj);
        return pj;
    }

}

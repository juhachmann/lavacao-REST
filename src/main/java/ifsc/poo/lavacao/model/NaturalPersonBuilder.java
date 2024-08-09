package ifsc.poo.lavacao.model;

import java.time.LocalDate;

public class NaturalPersonBuilder {

    private ClientBuilder clientBuilder;
    private LocalDate dataNascimento;
    private String cpf;

    NaturalPersonBuilder(ClientBuilder clientBuilder) {
        this.clientBuilder = clientBuilder;
    }

    public NaturalPersonBuilder setDataNascimento(LocalDate dataNascimento) {
        if(dataNascimento == null)
            throw new IllegalArgumentException("Data de Nascimento não pode ser nula");
        this.dataNascimento = dataNascimento;
        return this;
    }

    public NaturalPersonBuilder setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public NaturalPerson build() {
        NaturalPerson pf =  new NaturalPerson();
        pf.setNome(clientBuilder.nome);
        pf.setEmail(clientBuilder.email);
        pf.setCelular(clientBuilder.celular);
        pf.setDataCadastro(clientBuilder.dataCadastro);
        pf.setCpf(cpf);
        pf.setDataNascimento(dataNascimento);
        return pf;
    }

}

package ifsc.poo.lavacao.model;

import java.time.LocalDate;

public class ClientBuilder {

    String nome;
    String email;
    String celular;
    LocalDate dataCadastro;

    public ClientBuilder setNome(String nome) {
        if(nome == null || nome.isEmpty() || nome.isBlank())
            throw new IllegalArgumentException("Nome não pode estar em branco");
        this.nome = nome;
        return this;
    }

    public ClientBuilder setEmail(String email) {
        if(email == null || email.isEmpty() || email.isBlank())
            throw new IllegalArgumentException("Email não pode estar em branco");
        this.email = email;
        return this;
    }

    public ClientBuilder setCelular(String celular) {
        if(celular == null || celular.isEmpty() || celular.isBlank())
            throw new IllegalArgumentException("Celular não pode estar em branco");
        this.celular = celular;
        return this;
    }

    public ClientBuilder setDataCadastro(LocalDate dataCadastro) {
        if(dataCadastro == null)
            throw new IllegalArgumentException("Data de cadastro não pode estar vazia");
        this.dataCadastro = dataCadastro;
        return this;
    }

    public NaturalPersonBuilder pessoaFisica() {
        return new NaturalPersonBuilder(this);
    }

    public LegalEntityBuilder pessoaJuridica() {
        return new LegalEntityBuilder(this);
    }

}

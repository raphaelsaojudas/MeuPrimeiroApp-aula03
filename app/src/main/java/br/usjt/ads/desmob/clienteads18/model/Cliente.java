package br.usjt.ads.desmob.clienteads18.model;

import java.io.Serializable;

public class Cliente implements Serializable {

    private int id;
    private String nome, fone, email, diretor, lancamento;

    public Cliente(int id, String nome, String fone, String email, String diretor, String lancamento) {

        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.diretor = diretor;
        this.lancamento = lancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiretor(){return diretor;}

    public void setDiretor(String diretor) {this.diretor = diretor;}

    public String getLancamento(){return lancamento;}

    public void setLancamento(String lancamento) {this.lancamento = lancamento;}

    public String getFigura(){

        String figura = email.replace('@', '_');
        return figura.replace('.', '_');
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", lancamento='" + lancamento + '\'' +
                '}';
    }
}
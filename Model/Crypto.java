package br.com.unicuritiba.meujeitoninjadeinvestir.Model;

import java.io.Serializable;

public class Crypto implements Serializable {

    private String codein;
    private String name;
    private String bid;
    private String botao;

    public Crypto() {
    }

    public String getCodein() {
        return codein;
    }

    public void setCodein(String codein) {
        this.codein = codein;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBotao() {
        return botao;
    }

    public void setBotao(String botao) {
        this.botao = botao;
    }
}

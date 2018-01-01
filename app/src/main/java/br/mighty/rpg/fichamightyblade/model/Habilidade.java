package br.mighty.rpg.fichamightyblade.model;

import com.orm.SugarRecord;

/**
 * Created by igor on 25/12/17.
 */

public class Habilidade extends SugarRecord{

    private String nome;
    private String descricao;
    private String dificuldade;
    private int turnoDuracao;
    private int mana;
    private Classe classe;
    private Raca raca;
    private String requisito;

    public Habilidade() {
    }

    public Habilidade(String nome, String descricao, String dificuldade, int turnoDuracao, int mana) {
        this.nome = nome;
        this.descricao = descricao;
        this.dificuldade = dificuldade;
        this.turnoDuracao = turnoDuracao;
        this.mana = mana;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getTurnoDuracao() {
        return turnoDuracao;
    }

    public void setTurnoDuracao(int turnoDuracao) {
        this.turnoDuracao = turnoDuracao;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}

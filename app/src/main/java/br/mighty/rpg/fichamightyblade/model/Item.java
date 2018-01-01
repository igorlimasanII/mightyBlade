package br.mighty.rpg.fichamightyblade.model;

import com.orm.SugarRecord;

/**
 * Created by igor on 25/12/17.
 */

public class Item extends SugarRecord{
    private String nome;
    private String desc;
    private int bonusAgilidade;
    private int bonusForca;
    private int bonusInteligencia;
    private int bonusVontade;
    private int bonusDefesa;
    private int bonusDmg;
    private int bonusMp;
    private int bonusHp;
    private int qtde;
    private int tipo;

    public Item() {
    }

    public Item(String nome, String desc, int bonusAgilidade, int bonusForca, int bonusInteligencia, int bonusVontade, int bonusDefesa, int bonusDmg, int bonusMp, int bonusHp, int qtde, int tipo) {
        this.nome = nome;
        this.desc = desc;
        this.bonusAgilidade = bonusAgilidade;
        this.bonusForca = bonusForca;
        this.bonusInteligencia = bonusInteligencia;
        this.bonusVontade = bonusVontade;
        this.bonusDefesa = bonusDefesa;
        this.bonusDmg = bonusDmg;
        this.bonusMp = bonusMp;
        this.bonusHp = bonusHp;
        this.qtde = qtde;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getBonusAgilidade() {
        return bonusAgilidade;
    }

    public void setBonusAgilidade(int bonusAgilidade) {
        this.bonusAgilidade = bonusAgilidade;
    }

    public int getBonusForca() {
        return bonusForca;
    }

    public void setBonusForca(int bonusForca) {
        this.bonusForca = bonusForca;
    }

    public int getBonusInteligencia() {
        return bonusInteligencia;
    }

    public void setBonusInteligencia(int bonusInteligencia) {
        this.bonusInteligencia = bonusInteligencia;
    }

    public int getBonusVontade() {
        return bonusVontade;
    }

    public void setBonusVontade(int bonusVontade) {
        this.bonusVontade = bonusVontade;
    }

    public int getBonusDefesa() {
        return bonusDefesa;
    }

    public void setBonusDefesa(int bonusDefesa) {
        this.bonusDefesa = bonusDefesa;
    }

    public int getBonusDmg() {
        return bonusDmg;
    }

    public void setBonusDmg(int bonusDmg) {
        this.bonusDmg = bonusDmg;
    }

    public int getBonusMp() {
        return bonusMp;
    }

    public void setBonusMp(int bonusMp) {
        this.bonusMp = bonusMp;
    }

    public int getBonusHp() {
        return bonusHp;
    }

    public void setBonusHp(int bonusHp) {
        this.bonusHp = bonusHp;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /**
     * Retorna o tipo do item
     * 1 - consumivel
     * 2 - arma
     * 3 - armadura
     * 4 - acesssorios
     * @return um inteiro indicando o tipo do item
     */
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}

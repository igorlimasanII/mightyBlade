package br.mighty.rpg.fichamightyblade.model;

import com.orm.SugarRecord;

/**
 * Created by igor on 25/12/17.
 */

public class Raca extends SugarRecord{

    private String nome;
    private int bonusAgilidade;
    private int bonusForca;
    private int bonusInteligencia;
    private int bonusVontade;
    private int bonusAny;

    public Raca() {
    }

    public Raca(String nome, int bonusAgilidade, int bonusForca, int bonusInteligencia, int bonusVontade, int bonusAny) {
        this.nome = nome;
        this.bonusAgilidade = bonusAgilidade;
        this.bonusForca = bonusForca;
        this.bonusInteligencia = bonusInteligencia;
        this.bonusVontade = bonusVontade;
        this.bonusAny = bonusAny;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getBonusAny() {
        return bonusAny;
    }

    public void setBonusAny(int bonusAny) {
        this.bonusAny = bonusAny;
    }
}

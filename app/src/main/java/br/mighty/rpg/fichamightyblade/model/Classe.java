package br.mighty.rpg.fichamightyblade.model;

import com.orm.SugarRecord;

/**
 * Created by igor on 25/12/17.
 */

public class Classe extends SugarRecord{
    public String name;
    private int bonusAgilidade;
    private int bonusForca;
    private int bonusInteligencia;
    private int bonusVontade;
    private int bonusDefesa;
    private int bonusAny;

    public Classe() {
        this.bonusAgilidade = 0;
        this.bonusForca = 0;
        this.bonusInteligencia = 0;
        this.bonusVontade = 0;
        this.bonusDefesa = 0;
        this.bonusAny = 0;
    }

    public Classe(String name, int bonusAgilidade, int bonusForca, int bonusInteligencia, int bonusVontade, int bonusDefesa, int bonusAny) {
        this.name = name;
        this.bonusAgilidade = bonusAgilidade;
        this.bonusForca = bonusForca;
        this.bonusInteligencia = bonusInteligencia;
        this.bonusVontade = bonusVontade;
        this.bonusDefesa = bonusDefesa;
        this.bonusAny = bonusAny;
    }

    public String getName() {
        return name;
    }

    public int getBonusAgilidade() {
        return bonusAgilidade;
    }

    public int getBonusForca() {
        return bonusForca;
    }

    public int getBonusInteligencia() {
        return bonusInteligencia;
    }

    public int getBonusVontade() {
        return bonusVontade;
    }

    public int getBonusDefesa() {
        return bonusDefesa;
    }

    public int getBonusAny() {
        return bonusAny;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBonusAgilidade(int bonusAgilidade) {
        this.bonusAgilidade = bonusAgilidade;
    }

    public void setBonusForca(int bonusForca) {
        this.bonusForca = bonusForca;
    }

    public void setBonusInteligencia(int bonusInteligencia) {
        this.bonusInteligencia = bonusInteligencia;
    }

    public void setBonusVontade(int bonusVontade) {
        this.bonusVontade = bonusVontade;
    }

    public void setBonusDefesa(int bonusDefesa) {
        this.bonusDefesa = bonusDefesa;
    }

    public void setBonusAny(int bonusAny) {
        this.bonusAny = bonusAny;
    }
}

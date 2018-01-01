package br.mighty.rpg.fichamightyblade.model;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by igor on 25/12/17.
 */

public class Personagem extends SugarRecord{
    private String nome;
    private int maxHp;
    private int maxMp;
    private int hp;
    private int mp;
    private int vontade;
    private int inteligencia;
    private int forca;
    private int agilidade;
    private List<Classe> classes;
    private Raca raca;
    private List<Habilidade> skills;
    private int level;
    private int xp;
    private List<Item> inventario;
    private int gold;
    private int defesa;


    public Personagem() {
    }

    public Personagem(String nome, int maxHp, int maxMp, int hp, int mp, int vontade, int inteligencia, int forca, int agilidade, List<Classe> classes, Raca raca, List<Habilidade> skills, int level, int xp, List<Item> inventario, int gold, int defesa) {
        this.nome = nome;
        this.maxHp = maxHp;
        this.maxMp = maxMp;
        this.hp = hp;
        this.mp = mp;
        this.vontade = vontade;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.agilidade = agilidade;
        this.classes = classes;
        this.raca = raca;
        this.skills = skills;
        this.level = level;
        this.xp = xp;
        this.inventario = inventario;
        this.gold = gold;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getVontade() {
        return vontade;
    }

    public void setVontade(int vontade) {
        this.vontade = vontade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public List<Classe> getClasses() {
        return classes;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public List<Habilidade> getSkills() {
        return skills;
    }

    public void setSkills(List<Habilidade> skills) {
        this.skills = skills;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public List<Item> getInventario() {
        return inventario;
    }

    public void setInventario(List<Item> inventario) {
        this.inventario = inventario;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}

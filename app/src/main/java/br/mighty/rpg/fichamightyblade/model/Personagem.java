package br.mighty.rpg.fichamightyblade.model;

import java.util.List;

/**
 * Created by igor on 25/12/17.
 */

public class Personagem {
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
    private int defesa;
}

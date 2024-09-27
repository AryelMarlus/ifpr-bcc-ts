package edu.ifpr.personagem.atributos;

import java.util.HashMap;

public class Atributos {
    public HashMap<String, Integer> atributos;

    public Atributos() {
        this.atributos = new HashMap<>();
        this.atributos.put("Força", 8);
        this.atributos.put("Destreza", 8);
        this.atributos.put("Constituição", 8);
        this.atributos.put("Sabedoria", 8);
        this.atributos.put("Inteligência", 8);
        this.atributos.put("Carisma", 8);
    }


}

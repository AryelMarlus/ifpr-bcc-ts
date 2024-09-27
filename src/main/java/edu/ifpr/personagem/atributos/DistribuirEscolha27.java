package edu.ifpr.personagem.atributos;

import java.util.HashMap;

public class DistribuirEscolha27 implements DistribuirAtributosIniciais {
    private Integer pontosDisponiveis = 27;
    private HashMap<String, Integer> atributos = new HashMap<>()
    {{
        put("Força", 8);
        put("Destreza", 8);
        put("Constituição", 8);
        put("Sabedoria", 8);
        put("Inteligência", 8);
        put("Carisma", 8);
    }};
    private HashMap<Integer, Integer> custoAtributos = new HashMap<>()
    {{
       put(8, 0);
       put(9,1);
       put(10,2);
       put(11,3);
       put(12,4);
       put(13,5);
       put(14,7);
       put(15,9);
    }};

    @Override
    public HashMap<String, Integer> distribuirPontosIniciais() {
        return this.atributos;
    }

    public Integer setAtributo(String atributo, Integer valor) {
        if(!atributos.containsKey(atributo))
            throw new IllegalArgumentException("Atributo inválido");
        if (valor < 8 || valor > 15) {
            throw new IllegalArgumentException("Valor entre 8 e 15");
        } else if (pontosDisponiveis - this.custoAtributos.get(valor) > pontosDisponiveis) {
            throw new IllegalArgumentException("Pontos insificientes");
        }
        this.pontosDisponiveis -= this.custoAtributos.get(valor);
        return valor;
    }
}

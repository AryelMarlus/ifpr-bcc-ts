package edu.ifpr.personagem.atributos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DistribuirEscolha27Test {


    @Test
    @DisplayName("Teste de custo de atributos")
    void setAtributo() {
        DistribuirEscolha27 distribuirPontos = new DistribuirEscolha27();

        Integer pontosEsperados = 27;
        assertEquals(pontosEsperados,distribuirPontos.getPontosDisponiveis());
        distribuirPontos.setAtributo("Destreza", 15);
        pontosEsperados -= 9;
        assertEquals(pontosEsperados, distribuirPontos.getPontosDisponiveis());
        distribuirPontos.setAtributo("Força", 14);
        pontosEsperados -= 7;
        assertEquals(pontosEsperados, distribuirPontos.getPontosDisponiveis());
        distribuirPontos.setAtributo("Constituição", 13);
        pontosEsperados -= 5;
        assertEquals(pontosEsperados, distribuirPontos.getPontosDisponiveis());
        distribuirPontos.setAtributo("Sabedoria", 12);
        pontosEsperados -= 4;
        assertEquals(pontosEsperados, distribuirPontos.getPontosDisponiveis());

        distribuirPontos = new DistribuirEscolha27();
        pontosEsperados = 27;
        distribuirPontos.setAtributo("Força", 11);
        pontosEsperados -= 3;
        assertEquals(pontosEsperados, distribuirPontos.getPontosDisponiveis());
        distribuirPontos.setAtributo("Destreza", 10);
        pontosEsperados -= 2;
        assertEquals(pontosEsperados, distribuirPontos.getPontosDisponiveis());
        distribuirPontos.setAtributo("Constituição", 9);
        pontosEsperados -= 1;
        assertEquals(pontosEsperados, distribuirPontos.getPontosDisponiveis());
        distribuirPontos.setAtributo("Inteligência", 8);
        assertEquals(pontosEsperados, distribuirPontos.getPontosDisponiveis());
    }

    @Test
    @DisplayName("Teste de valores mínimos e máximos")
    void minimosMaximos(){
        DistribuirEscolha27 distribuirPontos = new DistribuirEscolha27();
        assertEquals(8, distribuirPontos.setAtributo("Força", 8));
        assertThrows(IllegalArgumentException.class, () -> distribuirPontos.setAtributo("Constituição", 7));
        assertThrows(IllegalArgumentException.class, () -> distribuirPontos.setAtributo("Constituição", 16));
        assertEquals(15, distribuirPontos.setAtributo("Constituição", 15));
    }

    @Test
    @DisplayName("Limite dos 27 pontos")
    void limite27(){
        DistribuirEscolha27 distribuirPontos = new DistribuirEscolha27();
        distribuirPontos.setAtributo("Força", 15);
        distribuirPontos.setAtributo("Destreza", 15);
        distribuirPontos.setAtributo("Constituição", 15);
        assertThrows(IllegalArgumentException.class, () -> distribuirPontos.setAtributo("Sabedoria", 9));
    }

}
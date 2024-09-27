package edu.ifpr.personagem.atributos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistribuirEscolha27Test {

    @Test
    @DisplayName("Set de atributos")
    void setAtributo() {
        DistribuirEscolha27 distribuirPontos = new DistribuirEscolha27();
        assertEquals(8, distribuirPontos.setAtributo("Força", 8));

    }
}
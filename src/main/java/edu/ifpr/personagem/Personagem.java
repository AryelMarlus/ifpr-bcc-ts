package edu.ifpr.personagem;

import edu.ifpr.personagem.atributos.DistribuirAtributosIniciais;
import edu.ifpr.personagem.raca.Raca;

public class Personagem {
    private Raca raca;
    private DistribuirAtributosIniciais atributosIniciais;


        private Integer forca = 8;
        private  Integer destreza = 8;
        private Integer constituicao = 8;
        private Integer carisma = 8;
        private Integer sabedoria = 8;
        private Integer inteligencia = 8;
        private Integer pontosDeVida;

    public Personagem(Raca raca, Integer forca, Integer destreza, Integer constituicao, Integer carisma, Integer sabedoria, Integer inteligencia, Integer pontosDeVida) {
        this.raca = raca;
        this.forca = this.validarSetAtributo(forca);
        this.destreza = this.validarSetAtributo(destreza);
        this.constituicao = constituicao;
        this.carisma = carisma;
        this.sabedoria = sabedoria;
        this.inteligencia = inteligencia;
        this.pontosDeVida = pontosDeVida;
    }

    private Integer validarSetAtributo(Integer valorAtributo){
        if (forca < 8 || forca >15){
            throw new IllegalArgumentException("Valor entre 8 e 15");
        }
        return valorAtributo;
    }

}

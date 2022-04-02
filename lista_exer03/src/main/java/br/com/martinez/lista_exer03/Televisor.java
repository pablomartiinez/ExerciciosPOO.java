//
package br.com.martinez.lista_exer03;

public class Televisor {
    boolean ligado;
    String canal;
    int volume;
    int numeroCanais;
    int volumeMaximo;
    boolean desligar;
    String alterarCanalParaCima;
    String alterarCanalParaBaixo;
    
    void imprimir() {
        System.out.println("Imprimindo");
    }
    
    void aumentarVolume() {
        System.out.println("Aumentar Volume");
    }
    
    void abaixarVolume(){
        System.out.println("Abaixar Volume");
    }
    
    void ligar() {
        System.out.println("Ligando");
    }
    
    void desligar() {
        System.out.println("Desligando");
    }
    
    void alterarCanalParaCima() {
        System.out.println("Para cima");
    }
    
    void alterarCanalParaBaixo() {
        System.out.println("Para baixo");
    }
    
}


/*** canal, volume, numeroCanais e volumeMaximo e, os
* métodos imprimir, aumentarVolume, abaixarVolume, ligar, desligar,/*
/** alterarCanalParaCima, alterarCanalParaBaixo, */
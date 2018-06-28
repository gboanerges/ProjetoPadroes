/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Stack;

/**
 *
 * @author aluno
 */
public class Fileira {

    private String nome;
    private Stack<Carta> fileira;

    public Fileira(String nome) {
        this.nome = nome;
        this.fileira = new Stack<>();
    }

    public void pushCarta(Carta carta) {

        fileira.push(carta);
    }

    public Carta popCarta() {

        return fileira.pop();
    }

    public void exibirFileira() {
        for (Carta carta : fileira) {
//            System.out.printf("Carta: %s, Naipe: %s, Cor:%s, Simbolo:%s\n", carta.getValor(), carta.getNaipe().getTipo(), carta.getNaipe().getCor(), carta.getSimbolo());
            if (carta.getVisivel()) {
                System.out.printf("%s %s", carta.getSimbolo(), carta.getNaipe().getTipo());
            } else {
                System.out.printf("%s, ", carta.getSimbolo());

            }
        }
    }
    
    public boolean estaVazia(){
        return fileira.empty();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jvboa
 */
public class Carta {

    private Naipe naipe;
    private String valor;

    public Carta(String valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
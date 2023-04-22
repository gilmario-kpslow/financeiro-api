/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.movimento;

/**
 *
 * @author gilmario
 */
public enum TipoMovimento {

    RECEITA("Receita"), DESPESA("Despesa");
    private final String descricao;

    private TipoMovimento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}

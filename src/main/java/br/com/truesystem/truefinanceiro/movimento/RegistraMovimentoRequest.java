package br.com.truesystem.truefinanceiro.movimento;

import java.math.BigDecimal;

/**
 *
 * @author gilmario
 */
public class RegistraMovimentoRequest {

    private BigDecimal valor;
    private TipoMovimento tipoMovimento;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(TipoMovimento tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

}

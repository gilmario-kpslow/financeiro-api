package br.com.truesystem.truefinanceiro.exception;

import java.time.LocalDateTime;

/**
 *
 * @author gilmario
 */
public class MensagemException {

    private final LocalDateTime dataOcorrencia;
    private final String mensagem;
    private final String detalhes;
    private final StatusMensagem status;

    public MensagemException(String mensagem, String detalhes, StatusMensagem status) {
        this.dataOcorrencia = LocalDateTime.now();
        this.mensagem = mensagem;
        this.status = status;
        this.detalhes = detalhes;
    }

    public LocalDateTime getDataOcorrencia() {
        return dataOcorrencia;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public StatusMensagem getStatus() {
        return status;
    }

}

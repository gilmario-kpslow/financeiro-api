package br.com.gilmariosoftware;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
public class Versao {

    private String versao;

    public Versao() {
        this.versao = "1.0.0-SNAPSHOT";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.truesystem.truefinanceiro.seguranca;

import br.com.truesystem.truefinanceiro.seguranca.jwt.JWTUtil;
import br.com.truesystem.truefinanceiro.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author gilmario
 */
@Component
public class UsuarioLogadoService {

    @Autowired
    private JWTUtil jWTUtil;

    @Autowired
    private UsuarioService usuarioService;

    @UsuarioLogadoProducer
    public UsuarioLogadoCriado getUsuarioRequest() {
        String username = jWTUtil.getUsernameFromToken();
        return new UsuarioLogadoCriado(usuarioService.findByUsername(username));
    }
}

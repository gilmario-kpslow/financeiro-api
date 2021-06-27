package br.com.truesystem.truefinanceiro.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gilmario
 */
@RestController
@RequestMapping("autenticar")
public class LoginController {

    @Autowired
    private LoginService service;

    @PostMapping
    public LoginResponse login(@RequestBody LoginRequest login) {
        return this.service.login(login.getUsername(), login.getPassword());
    }
}

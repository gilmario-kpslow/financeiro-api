package br.com.truesystem.truefinanceiro;

import br.com.truesystem.truefinanceiro.credencial.Credencial;
import br.com.truesystem.truefinanceiro.credencial.CredencialService;
import br.com.truesystem.truefinanceiro.seguranca.UsuarioDetalhesService;
import br.com.truesystem.truefinanceiro.usuario.Usuario;
import br.com.truesystem.truefinanceiro.usuario.UsuarioService;
import java.util.Optional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author gilmario
 */
@SpringBootApplication
public class FinanceiroApplication {

    public static void main(String... args) {
        SpringApplication.run(FinanceiroApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UsuarioService service, PasswordEncoder passwordEncoder, CredencialService credencialService, UsuarioDetalhesService detalhesService) {
        return args -> {

            Optional<Boolean> existe = service.existsByUsername("financeiro");
            if (!existe.get()) {
                Usuario admin = new Usuario();
                admin.setEmail("admin@gmail.com");
                admin.setNome("Admin");
                admin.setUsername("financeiro");
                admin.setNomeCompleto("Usuario Administrador da Silva 350");
                service.salvar(admin);
                Credencial credencial = credencialService.create(admin, "123456789");
                System.out.println("br.com.truesystem.truefinanceiro.FinanceiroApplication.init()");
            }
        };
    }
}

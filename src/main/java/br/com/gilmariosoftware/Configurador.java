package br.com.gilmariosoftware;

import br.com.gilmariosoftware.usuario.RequestPassword;
import br.com.gilmariosoftware.usuario.Usuario;
import br.com.gilmariosoftware.usuario.UsuarioRequest;
import br.com.gilmariosoftware.usuario.UsuarioService;
import io.quarkus.runtime.Startup;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@Startup
@ApplicationScoped
public class Configurador {

    private UsuarioService usuarioService;

    public Configurador(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostConstruct
    public void init() {

        Optional<Usuario> op = usuarioService.findByUsername("financeiro");

        if (op.isEmpty()) {
            UsuarioRequest admin = new UsuarioRequest();
            admin.setEmail("admin@email.com");
            admin.setUsername("financeiro");
            admin.setPassword("financeiro@financeiro");
            admin.setNome("Administrador");
            usuarioService.salvar(admin);

            usuarioService
                    .createPassword(RequestPassword.builder().id(admin.getId()).password("financeiro@financeiro").build());
        } else {
            Usuario u = op.get();
            if (Objects.isNull(u.getPassword())) {
                usuarioService.createPassword(RequestPassword.builder()
                        .id(u.getId())
                        .password("financeiro@financeiro")
                        .build());
            }

        }

    }

}

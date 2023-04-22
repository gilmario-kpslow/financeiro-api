package br.com.gilmariosoftware.usuario;

import br.com.gilmariosoftware.generic.ServiceGeneric;
import br.com.gilmariosoftware.seguranca.PasswordManager;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gilmario
 */
@RequestScoped
public class UsuarioService extends ServiceGeneric<Usuario, UsuarioResponse> {

    @Inject
    UsuarioRepository repository;

    @Inject
    PasswordManager passwordManager;

    public Optional<UsuarioResponse> salvar(UsuarioRequest request) {
        return super.salvar(request);
    }

    public Optional<Usuario> findByUsername(String name) {
        return repository.findByUsername(name);
    }

    @Override
    protected JpaRepository getRepository() {
        return repository;
    }

    @Override
    public Class<Usuario> getClassEntity() {
        return Usuario.class;
    }

    @Override
    public Class<UsuarioResponse> getClassResponse() {
        return UsuarioResponse.class;
    }

    @Override
    protected Optional<UsuarioResponse> toResponse(Usuario t) {
        return super.toResponse(t);
    }

    public void createPassword(RequestPassword request) {
        repository.createPassword(request.getId(), passwordManager.encript(request.getPassword()));
    }

    public Optional<UsuarioResponse> getDadosUsuarioLogado() {
        return toResponse(getUsuarioLogado().get());
    }

    public Optional<UsuarioRegistroResponse> registrar(UsuarioRequest request) {
        Optional<UsuarioResponse> save = this.salvar(request);
        if (save.isEmpty()) {
            throw new RuntimeException("Erro ao cadastrar usuário!");
        }
        UsuarioResponse resp = save.get();
        this.createPassword(new RequestPassword(resp.getId(), request.getPassword()));

        return Optional.of(new UsuarioRegistroResponse());
    }

}

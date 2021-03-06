package br.com.truesystem.truefinanceiro.usuario;

/**
 *
 * @author gilmario
 */
public class UsuarioRegistroRequest {

    private String nome;
    private String nomeCompleto;
    private String email;
    private String username;
//    private String tokenValidation;

    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setNome(nome);
        usuario.setNomeCompleto(nomeCompleto);
        usuario.setUsername(username);
        return usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

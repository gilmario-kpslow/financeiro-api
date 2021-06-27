/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.truesystem.truefinanceiro.usuario;

import br.com.truesystem.truefinanceiro.credencial.CredencialService;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 *
 * @author gilmario
 */
//@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TestConfig.class)
@AutoConfigureMockMvc
public class UsuarioServiceTest {

    @Mock
    UsuarioRepository repository;

    @Mock
    CredencialService credencialService;

    @InjectMocks
    UsuarioService instance;

    public UsuarioServiceTest() {
    }

    @Test
    public void testExistsByUsername() {
        System.out.println("existsByUsername");
        String username = "";
        Mockito.when(repository.existsByUsername(username)).thenReturn(Optional.of(true));
        Optional<Boolean> result = instance.existsByUsername(username);
        assertTrue(result.get());
    }

    @Test
    public void testRegistrar() throws Exception {
        System.out.println("registrar");

        UsuarioRegistroRequest registro = new UsuarioRegistroRequest();
        registro.setEmail("email@email.com");
        registro.setNome("exemplo");
        registro.setNomeCompleto("Nome completo");
//        registro.setSenha("123456");
        registro.setUsername("username");

        Mockito.when(repository.existsByUsername(registro.getUsername())).thenReturn(Optional.of(false));
        Mockito.when(repository.existsByEmail(registro.getEmail())).thenReturn(Optional.of(false));

        Mockito.when(repository.save(registro.getUsuario())).thenReturn(registro.getUsuario());

        Usuario usuario = instance.registrar(registro);
        assertNotNull(usuario);
    }

//    @Test
//    public void testValidaExisteByUsername() throws Exception {
//        System.out.println("validaExisteByUsername");
//        String username = "";
//        instance.validaExisteByUsername(username);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testValidaExisteByEmail() throws Exception {
//        System.out.println("validaExisteByEmail");
//        String email = "";
//        instance.validaExisteByEmail(email);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testFindByUsername() {
//        System.out.println("findByUsername");
//        String username = "";
//        Usuario expResult = null;
//        Usuario result = instance.findByUsername(username);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
}

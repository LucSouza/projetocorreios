package com.projetocorreios.apirest.resources;
import java.util.List;

import com.projetocorreios.apirest.models.Tracking;
import com.projetocorreios.apirest.models.Usuario;
import com.projetocorreios.apirest.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value="/api")
@Api(value="API Rest Usuario")
@CrossOrigin(origins = "*")
public class UsuarioResource {

//    @RequestMapping("/users")
//    @ResponseBody
//    public String getUsers() {
//        return "{\"users\":[{\"name\":\"Lucas\", \"country\":\"Brazil\"}," +
//                "{\"name\":\"Jackie\",\"country\":\"China\"}]}";
//    }


    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    @ApiOperation(value="Retorna os Usuarios")
    public List<Usuario> listaUsuario(){

        return usuarioRepository.findAll();

    }
    @GetMapping("/usuario/{cpf}")
    @ApiOperation(value="retorna um Usuario")
    public Usuario acharUsuario(@PathVariable(value = "cpf") long cpf){

        return usuarioRepository.findById(cpf);

    }

    @PostMapping("/usuario")
    @ApiOperation(value="Salva um Usuario")
    public Usuario cadastraUsuario(@RequestBody Usuario usuario){ return usuarioRepository.save(usuario);
    }


    @DeleteMapping("/usuario")
    @ApiOperation(value="Deleta um Usuario")
    public void deleteUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    @PutMapping("/usuario")
    @ApiOperation(value="Atualiza um Usuario")
    public Usuario atualizarUsuario (@RequestBody Usuario usuario)
    {
        return usuarioRepository.save(usuario);
    }
}
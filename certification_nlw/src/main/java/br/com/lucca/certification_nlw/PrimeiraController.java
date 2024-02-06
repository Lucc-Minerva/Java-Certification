package br.com.lucca.certification_nlw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("./primeiracontroller")
public class PrimeiraController {

    @GetMapping("/retornarPrimeiraController")
    public Usuario retornoPrimeiraController() {
        
        var usuario = new Usuario("Lucas", 23);
        return usuario;
    }

    @PostMapping("/meuPrimeiroPost")
    public String primeiroPost() {
        return "Meu primeiro POST";
    }

    record Usuario (String nome, int idade) {

    }
}

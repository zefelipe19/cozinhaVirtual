package dev.zefelipe19.cozinhaVirtual;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CozinhaController {
    @GetMapping("/")
    public String helloWorld() {
        return "<h1>Cozinha Virtual</h1>" +
                "<p>Esse projeto tem como objetivo te ajudar na cozinha com receitas saborosas.</p>" +
                "<p>projeto feito com Spring Boot e Java</p>";
    }
    @GetMapping("/api/")
    public String api() {

        return "Comida: " + "quantidade: " ;
    }
}

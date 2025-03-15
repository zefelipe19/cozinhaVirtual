package dev.zefelipe19.cozinhaVirtual;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CozinhaController {

    @Autowired
    private CozinhaService cozinhaService;

    @GetMapping("/bem-vindo")
    public String helloWorld() {
        return "<h1>Cozinha Virtual</h1>" +
                "<p>Esse projeto tem como objetivo te ajudar na cozinha com receitas saborosas.</p>" +
                "<p>projeto feito com Spring Boot e Java</p>";
    }
    @GetMapping("/")
    public List<CozinhaModel> getAllAlimentos() {
        return cozinhaService.getAllAlimentos();
    }

    @PostMapping("/")
    public CozinhaModel createAlimento(@RequestBody CozinhaModel alimento) {
        System.out.println(alimento.getQuantity());
        return cozinhaService.createAlimento(alimento);
    }
}

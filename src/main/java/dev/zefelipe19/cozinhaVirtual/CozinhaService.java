package dev.zefelipe19.cozinhaVirtual;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CozinhaService {
    @Autowired
    private CozinhaRepository cozinhaRepository;

    public CozinhaModel createAlimento(CozinhaModel alimento) {
        return cozinhaRepository.save(alimento);
    }

    public List<CozinhaModel> getAllAlimentos() {
        return cozinhaRepository.findAll();
    }
}

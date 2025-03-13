package dev.zefelipe19.cozinhaVirtual;

import jakarta.persistence.*;

// Definindo uma a classe na tabela do banco de dados.
@Entity
@Table(name = "tb_cozinha_virtual")
public class CozinhaModel {

    @Id // Identificando o atributo id para a tabela no banco de dados.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Deixando a geração do id sendo sequencial.
    private Long id;
    private String name;
    private int quantity;

    public CozinhaModel() {}

    public CozinhaModel(String name, int quantity, Long id) {
        this.name = name;
        this.quantity = quantity;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

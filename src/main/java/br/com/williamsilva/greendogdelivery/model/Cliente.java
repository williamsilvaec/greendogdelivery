package br.com.williamsilva.greendogdelivery.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Length(min = 2, max = 30, message = "o tamanho deve ser entre {min} e {max} caracteres")
    private String nome;

    @NotEmpty
    private String endereco;
}

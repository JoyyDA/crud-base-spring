package com.joy.crud_base_spring.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

/* PRATICAMENTE O MODEL DE USUARIO */

@Getter
@Setter /* Gera os atributos */
@AllArgsConstructor
@NoArgsConstructor /* Cria construtores */
@Builder
@Table(name="usuario")
@Entity /* Marca a classe como uma tableba no banco de dados */
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;
}

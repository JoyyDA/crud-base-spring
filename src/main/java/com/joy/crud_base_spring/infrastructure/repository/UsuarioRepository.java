package com.joy.crud_base_spring.infrastructure.repository;

import com.joy.crud_base_spring.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    /*Em caso de algum erro ele não pode deletar esse email*/
    @Transactional
    void deleteByEmail(String email);


}

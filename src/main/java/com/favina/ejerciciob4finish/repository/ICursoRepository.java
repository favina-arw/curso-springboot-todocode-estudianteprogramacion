package com.favina.ejerciciob4finish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.favina.ejerciciob4finish.model.Curso;
import java.util.List;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
    
    //Buscar un curso en base al NOMBRE conteniendo la/s palabra/s que se den en el filtro
    List<Curso> findByNombreContaining(String filtro);
}

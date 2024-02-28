package com.favina.ejerciciob4finish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.favina.ejerciciob4finish.model.Tema;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long> {

}

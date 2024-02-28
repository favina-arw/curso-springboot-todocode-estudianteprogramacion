package com.favina.ejerciciob4finish.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private Date fecha_finalizacion;
    @OneToMany(mappedBy = "curso")
    private List<Tema> listaDeTemas;

}

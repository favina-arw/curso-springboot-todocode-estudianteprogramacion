package com.favina.ejerciciob4finish.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_tema;
    private String nombre;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    // Al momento de formatear el objeto TEMA a Json, ignora el atributo debajo para
    // evitar errores
    @JsonIgnore
    Curso curso;
}

package com.favina.ejerciciob4finish.dto;

import java.util.List;

import com.favina.ejerciciob4finish.model.Tema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CursoTemaDTO {
    private String nombreCurso;
    private List<Tema> listaTemas;

}

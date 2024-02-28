package com.favina.ejerciciob4finish.service;

import com.favina.ejerciciob4finish.dto.CursoTemaDTO;
import com.favina.ejerciciob4finish.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;

import com.favina.ejerciciob4finish.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;

public class CursoService implements ICursoService {
    @Autowired
    private ICursoRepository cursoRepository;

    @Override
    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public void saveCurso(Curso c) {
        cursoRepository.save(c);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public Curso findCurso(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    @Override
    public void editCurso(Curso c) {
        this.saveCurso(c);
    }

    @Override
    public CursoTemaDTO temasPorCurso(Long id_curso) {
        CursoTemaDTO ctDTO = new CursoTemaDTO();
        Curso curso_search = this.findCurso(id_curso);
        ctDTO.builder()
                .nombreCurso(curso_search.getNombre())
                .listaTemas(curso_search.getListaDeTemas())
                .build();
        return ctDTO;
    }

    @Override
    public List<Curso> getCursosFiltered(String palabra) {
        List<Curso> cursos = this.getCursos();
        List<Curso> filtrados = new ArrayList<>();
        
        for (Curso c : cursos) {
            boolean contienePalabra = c.getNombre().toUpperCase().contains(palabra.toUpperCase());
            if(contienePalabra)
                filtrados.add(c);
        }
        
        return filtrados;
    }

    @Override
    public List<Curso> searchCursosFiltered(String palabra) {
        return cursoRepository.findByNombreContaining(palabra);
    }
    
    
}

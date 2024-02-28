package com.favina.ejerciciob4finish.service;

import com.favina.ejerciciob4finish.dto.CursoTemaDTO;
import java.util.List;
import com.favina.ejerciciob4finish.model.Curso;

public interface ICursoService {
    
    public List<Curso> getCursos();
    
    public void saveCurso(Curso c);
    
    public void deleteCurso(Long id);
    
    public Curso findCurso(Long id);
    
    public void editCurso(Curso c);
    
    public CursoTemaDTO temasPorCurso(Long id_curso);
    
    public List<Curso> getCursosFiltered(String palabra);
    
    public List<Curso> searchCursosFiltered(String palabra);

}

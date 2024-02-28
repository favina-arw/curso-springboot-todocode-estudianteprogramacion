package com.favina.ejerciciob4finish.controller;

import com.favina.ejerciciob4finish.dto.CursoTemaDTO;
import com.favina.ejerciciob4finish.model.Curso;
import com.favina.ejerciciob4finish.service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    
    @Autowired
    private ICursoService cursoService;
    
    @GetMapping("")
    public String saludo() {
        return "<h1>Saludos desde CursoController!</h1>";
    }
    
    @GetMapping("/cursos/traer")
    public List<Curso> getCursos(){
        return cursoService.getCursos();
    }
    
    @PostMapping("/cursos/crear")
    public String crearCurso(@RequestBody Curso curso){
        cursoService.saveCurso(curso);    
        return "Curso guardado exitosamente";
    }
    
    @GetMapping("/cursos/temas/{id_curso}")
    public CursoTemaDTO temasPorCurso(@PathVariable Long id_curso){
        return cursoService.temasPorCurso(id_curso);
    }
    
    @GetMapping("/cursos/fitrar/{palabra}")
    public List<Curso> getCursos(@PathVariable String palabra){
        return cursoService.getCursosFiltered(palabra);
    }
    
    @GetMapping("/cursos/search/{palabra}")
    public List<Curso> searchCursosByFiltro(@PathVariable String palabra){
        return cursoService.getCursosFiltered(palabra);
    }
    
    @PutMapping("/cursos/edit")
    public String editCurso(@RequestBody Curso c){
        cursoService.editCurso(c);
        return "Curso editado correctamente";
    }
    
    @DeleteMapping("/cursos/borrar/{id_curso}")
    public String deleteCurso(@PathVariable Long id){
        cursoService.deleteCurso(id);
        return "Curso eliminado correctamente";
    }
            
}

package com.favina.ejerciciob4finish.controller;

import com.favina.ejerciciob4finish.service.ITemaService;
import com.favina.ejerciciob4finish.model.Tema;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temas")
public class TemaController {
    
    private ITemaService temaService;
    
    @GetMapping("")
    public String saludo() {
        return "<h1>Saludos desde TemaController!</h1>";
    }
    
    @PostMapping("/temas/crear")
    public String crearTema(@RequestBody Tema tema){
        temaService.saveTema(tema);
        return "Tema creado con éxito";
    }
    
    @GetMapping("/temas/traer")
    public List<Tema> getTemas(){
        return temaService.getTemas();
    }
    
    @GetMapping("/temas/{id_tema}")
    public Tema getTema(@PathVariable Long id){
        return temaService.findTema(id);
    }
    
    @DeleteMapping("/temas/borrar/{id_tema}")
    public String deleteTema(@PathVariable Long id_tema){
        temaService.deleteTema(id_tema);
        return "Tema borrado con éxito";
    }
    
    @PutMapping("/temas/editar")
    public String editarTema(@RequestBody Tema t){
        temaService.editTema(t);
        return "Tema editado exitosamente";
    }
}

package com.favina.ejerciciob4finish.service;

import java.util.List;
import com.favina.ejerciciob4finish.model.Tema;

public interface ITemaService {

    public List<Tema> getTemas();
    
    public void saveTema(Tema t);
    
    public void deleteTema(Long id);
    
    public Tema findTema(Long id);
    
    public void editTema(Tema t);
    
    
    
}

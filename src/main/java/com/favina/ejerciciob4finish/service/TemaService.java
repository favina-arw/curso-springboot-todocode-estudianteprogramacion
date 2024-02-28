package com.favina.ejerciciob4finish.service;

import com.favina.ejerciciob4finish.model.Tema;
import org.springframework.beans.factory.annotation.Autowired;

import com.favina.ejerciciob4finish.repository.ITemaRepository;
import java.util.List;

public class TemaService implements ITemaService {
    @Autowired
    private ITemaRepository temaRepository;

    @Override
    public List<Tema> getTemas() {
        return temaRepository.findAll();
    }

    @Override
    public void saveTema(Tema t) {
        temaRepository.save(t);
    }

    @Override
    public void deleteTema(Long id) {
        temaRepository.deleteById(id);
    }

    @Override
    public Tema findTema(Long id) {
        return temaRepository.findById(id).orElse(null);
    }

    @Override
    public void editTema(Tema t) {
        this.saveTema(t);
    }
}

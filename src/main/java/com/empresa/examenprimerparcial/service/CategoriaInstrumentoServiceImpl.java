package com.empresa.examenprimerparcial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.empresa.examenprimerparcial.model.CategoriaInstrumento;
import com.empresa.examenprimerparcial.repository.CategoriaInstrumentoRepository;

public class CategoriaInstrumentoServiceImpl implements CategoriaInstrumentoService {
    @Autowired
    CategoriaInstrumentoRepository categoriaInstrumentoRepository;

    @Override
    public List<CategoriaInstrumento> getAllCategoriaInstrumento() {
        return categoriaInstrumentoRepository.findAll();
    }
}

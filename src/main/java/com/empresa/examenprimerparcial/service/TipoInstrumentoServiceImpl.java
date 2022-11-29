package com.empresa.examenprimerparcial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.empresa.examenprimerparcial.model.TipoInstrumento;
import com.empresa.examenprimerparcial.repository.TipoInstrumentoRepository;

public class TipoInstrumentoServiceImpl implements TipoInstrumentoService {
    @Autowired
    TipoInstrumentoRepository tipoInstrumentoRepository;

    @Override
    public List<TipoInstrumento> getAllTipoInstrumento() {
        return tipoInstrumentoRepository.findAll();
    }
}

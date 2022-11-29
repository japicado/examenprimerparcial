package com.empresa.examenprimerparcial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.empresa.examenprimerparcial.model.Empresa;
import com.empresa.examenprimerparcial.repository.EmpresaRepository;

public class EmpresaServiceImpl implements EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> getAllEmpresas() {
        return empresaRepository.findAll();
    }
}

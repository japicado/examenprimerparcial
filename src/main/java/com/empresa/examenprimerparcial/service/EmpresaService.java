package com.empresa.examenprimerparcial.service;

import java.util.List;

import com.empresa.examenprimerparcial.model.Empresa;

public interface EmpresaService {
    List<Empresa> getAllEmpresas();

    Empresa readByName(String nombre);

    List<Empresa> findByName(String nombre);
}

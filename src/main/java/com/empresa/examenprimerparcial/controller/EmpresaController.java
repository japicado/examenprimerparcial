package com.empresa.examenprimerparcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.examenprimerparcial.model.Empresa;
import com.empresa.examenprimerparcial.service.EmpresaService;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @GetMapping("/all")
    public Object getHoliday() {
        return this.empresaService.getAllEmpresas();
    }

    @GetMapping("/nombre/{nombre}")
    public Empresa readClientReferenceByCode(@PathVariable("nombre") String nombre) {
        return this.empresaService.readByName(nombre);
    }
}

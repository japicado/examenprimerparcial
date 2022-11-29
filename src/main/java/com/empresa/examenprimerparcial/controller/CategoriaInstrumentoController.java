package com.empresa.examenprimerparcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.examenprimerparcial.service.CategoriaInstrumentoService;

@RestController
@RequestMapping("/categoriainstrumento")
public class CategoriaInstrumentoController {
    @Autowired
    CategoriaInstrumentoService categoriaInstrumentoService;

    @GetMapping("/all")
    public Object getHoliday() {
        return this.categoriaInstrumentoService.getAllCategoriaInstrumento();
    }
}

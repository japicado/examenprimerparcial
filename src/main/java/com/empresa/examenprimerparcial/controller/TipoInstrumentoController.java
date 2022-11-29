package com.empresa.examenprimerparcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.examenprimerparcial.service.TipoInstrumentoService;

@RestController
@RequestMapping("/tipoinstrumento")
public class TipoInstrumentoController {
    @Autowired
    TipoInstrumentoService tipoInstrumentoService;

    @GetMapping("/all")
    public Object getTipoInstrumento() {
        return this.tipoInstrumentoService.getAllTipoInstrumento();
    }

}

package com.empresa.examenprimerparcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.examenprimerparcial.model.CategoriaInstrumento;
import com.empresa.examenprimerparcial.model.CategoriaInstrumentoPK;

public interface CategoriaInstrumentoRepository extends JpaRepository<CategoriaInstrumento, CategoriaInstrumentoPK> {

}

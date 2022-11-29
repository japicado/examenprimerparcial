package com.empresa.examenprimerparcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.examenprimerparcial.model.TipoInstrumento;
import com.empresa.examenprimerparcial.model.TipoInstrumentooPK;

public interface TipoInstrumentoRepository extends JpaRepository<TipoInstrumento, TipoInstrumentooPK> {

}

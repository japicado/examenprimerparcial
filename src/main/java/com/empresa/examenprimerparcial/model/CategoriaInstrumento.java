package com.empresa.examenprimerparcial.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tes_categoria_instrumento")
@Data
@NoArgsConstructor
public class CategoriaInstrumento {

    @EmbeddedId
    private CategoriaInstrumentoPK pk;

    @Column(name = "cod_logotipo_empresa", length = 100, nullable = false)
    private String codLogotipoEmpresa;

    @Column(name = "tipo_renta", length = 2, nullable = false)
    private String codLogotipoReporte;
}

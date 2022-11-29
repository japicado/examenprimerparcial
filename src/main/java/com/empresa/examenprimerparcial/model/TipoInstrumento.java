package com.empresa.examenprimerparcial.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tes_tipo_instrumento")
@Data
@NoArgsConstructor
public class TipoInstrumento {
    @EmbeddedId
    private TipoInstrumentooPK pk;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "tipo_renta", length = 2, nullable = false)
    private String tipoRenta;

    @Column(name = "cod_clase_instrumento", length = 15, nullable = false)
    private String codClaseInstrumento;

    @Column(name = "estado", length = 3, nullable = false)
    private String estado;

    @Column(name = "fecha_creacion", length = 8, nullable = false)
    private Timestamp fechaCreacion;
}

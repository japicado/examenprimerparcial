package com.empresa.examenprimerparcial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gen_empresa")
@Data
@NoArgsConstructor
public class Empresa {
    @Id
    @Column(name = "cod_empresa", nullable = true)
    private Integer codEmpresa;

    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;

    @Column(name = "cod_logotipo_empresa", length = 8, nullable = false)
    private Integer codLogotipoEmpresa;

    @Column(name = "cod_logotipo_reporte", length = 8, nullable = false)
    private Integer codLogotipoReporte;
}

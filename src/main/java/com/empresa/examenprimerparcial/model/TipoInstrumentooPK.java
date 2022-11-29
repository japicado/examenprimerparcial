package com.empresa.examenprimerparcial.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
public class TipoInstrumentooPK implements Serializable {
    @Column(name = "cod_empresa", length = 8, nullable = false)
    private String codEmpresa;

    @Column(name = "cod_tipo_instrumento", length = 15, nullable = false)
    private String codTipoInstrumento;

    @Column(name = "cod_categoria_instrumento", length = 15, nullable = false)
    private String codCategoriaInstrumento;
}

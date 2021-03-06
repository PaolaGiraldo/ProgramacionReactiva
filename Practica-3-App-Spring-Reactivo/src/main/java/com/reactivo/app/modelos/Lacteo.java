package com.reactivo.app.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document("lacteos")
public class Lacteo {

    @Id
    private String serial;
    private String tipo;
    private int peso;
    private String presentacion;
    private int precio;

}

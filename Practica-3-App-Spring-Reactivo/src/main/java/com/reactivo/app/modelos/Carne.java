package com.reactivo.app.modelos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document("carnes")
public class Carne {

    @Id
    private String serial;
    private String nombre;
    private int precio;
    private int maduracion;
    private int peso;

}

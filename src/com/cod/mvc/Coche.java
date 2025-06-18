/**
 *
 *  version 2.0
 *  markdown @author PIERO LOPEZ ROSAS
 */
package com.cod.mvc;

public class Coche {
    public String matricula;
    public String modelo;
    public Integer velocidad;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }
}

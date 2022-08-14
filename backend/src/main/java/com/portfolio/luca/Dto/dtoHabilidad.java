/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.luca.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHabilidad {
    
    @NotBlank
    private String nombreH;
    @NotBlank
    private String porcentajeH;
    
    //Constructor

    public dtoHabilidad() {
    }

    public dtoHabilidad(String nombreH, String porcentajeH) {
        this.nombreH = nombreH;
        this.porcentajeH = porcentajeH;
    }
    
    //Getter and setter

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getPorcentajeH() {
        return porcentajeH;
    }

    public void setPorcentajeH(String porcentajeH) {
        this.porcentajeH = porcentajeH;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.luca.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    
    @NotBlank
    private String nombreEdu;
    @NotBlank
    private String institucion;
    @NotBlank
    private String descripcionEdu;
    @NotBlank
    private String agnoInicio;
    @NotBlank
    private String agnoFinal;
    
    //Constructor

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEdu, String institucion, String descripcionEdu, String agnoInicio, String agnoFinal) {
        this.nombreEdu = nombreEdu;
        this.institucion = institucion;
        this.descripcionEdu = descripcionEdu;
        this.agnoInicio = agnoInicio;
        this.agnoFinal = agnoFinal;
    }
    
    // Getter and Setter

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getAgnoInicio() {
        return agnoInicio;
    }

    public void setAgnoInicio(String añoInicio) {
        this.agnoInicio = añoInicio;
    }

    public String getAgnoFinal() {
        return agnoFinal;
    }

    public void setAgnoFinal(String añoFinal) {
        this.agnoFinal = añoFinal;
    }
    
    
    
}

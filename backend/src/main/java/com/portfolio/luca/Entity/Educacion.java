/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.luca.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEdu;
    private String institucion;
    
    @Column(length = 1000)
    private String descripcionEdu;
    
    private String agnoInicio;
    
    private String agnoFinal;
    
    //Constructor
    
    public Educacion() {
    }

    public Educacion(String nombreEdu, String institucion, String descripcionEdu, String agnoInicio, String agnoFinal) {
        this.nombreEdu = nombreEdu;
        this.institucion = institucion;
        this.descripcionEdu = descripcionEdu;
        this.agnoInicio = agnoInicio;
        this.agnoFinal = agnoFinal;
    }
    
    //Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

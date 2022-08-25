/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.luca.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    
    @NotBlank
    private String nombreP;
    
    @NotBlank
    private String descripcionP;
    
    @NotBlank
    private String imagen;
    
    @NotBlank
    private String linkP;
    
    //Constructor

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String imagen, String linkP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imagen = imagen;
        this.linkP = linkP;
    }
    
    //getter and setter

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getLinkP() {
        return linkP;
    }

    public void setLinkP(String linkP) {
        this.linkP = linkP;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.luca.Dto;

import javax.validation.constraints.NotBlank;


public class dtoAcerca {
    
    @NotBlank
    private String acerca;
    @NotBlank
    private String nacimiento;
    @NotBlank
    private String email;
    @NotBlank
    private String lenguaje;
    
    //Constructor

    public dtoAcerca() {
    }

    public dtoAcerca(String acerca, String nacimiento, String email, String lenguaje) {
        this.acerca = acerca;
        this.nacimiento = nacimiento;
        this.email = email;
        this.lenguaje = lenguaje;
    }
    
    //Getter and setter

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    
    
}

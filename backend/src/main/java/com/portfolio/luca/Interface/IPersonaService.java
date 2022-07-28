/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.luca.Interface;

import com.portfolio.luca.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un usuario buscado por ID
    public void deletePersona(Long id);
    
    //buscar una persona
    public Persona findPersona(Long id);
    
}

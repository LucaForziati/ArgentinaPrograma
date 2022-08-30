/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.luca.Controler;

import com.portfolio.luca.Dto.dtoHabilidad;
import com.portfolio.luca.Entity.Habilidad;
import com.portfolio.luca.Security.Controller.Mensaje;
import com.portfolio.luca.Service.SHabilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/habilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidad {
    
    @Autowired
    SHabilidad sHabilidad;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Habilidad>> list(){
        List<Habilidad> list = sHabilidad.list();
        return new ResponseEntity(list, HttpStatus.OK);      
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Habilidad> getById(@PathVariable("id")int id){
        if(!sHabilidad.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        Habilidad habilidad = sHabilidad.getOne(id).get();
        return new ResponseEntity(habilidad, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sHabilidad.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sHabilidad.delete(id);
        return new ResponseEntity(new Mensaje("Habilidad eliminada"), HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHabilidad dtohabilidad){
        if(StringUtils.isBlank(dtohabilidad.getNombreH())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtohabilidad.getPorcentajeH())){
            return new ResponseEntity(new Mensaje("El porcentaje es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(sHabilidad.existsByNombreH(dtohabilidad.getNombreH())){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        Habilidad habilidad = new Habilidad(
                dtohabilidad.getNombreH(), dtohabilidad.getPorcentajeH()
            );
        sHabilidad.save(habilidad);
        return new ResponseEntity(new Mensaje("Educacion creada"), HttpStatus.OK);
                
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHabilidad dtohabilidad){
        if(!sHabilidad.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(sHabilidad.existsByNombreH(dtohabilidad.getNombreH()) && sHabilidad.getByNombreH(dtohabilidad.getNombreH()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtohabilidad.getNombreH())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtohabilidad.getPorcentajeH())){
            return new ResponseEntity(new Mensaje("El porcentaje es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        
        Habilidad habilidad = sHabilidad.getOne(id).get();
        
        habilidad.setNombreH(dtohabilidad.getNombreH());
        habilidad.setPorcentajeH(dtohabilidad.getPorcentajeH());
        
        sHabilidad.save(habilidad);
        
        return new ResponseEntity(new Mensaje("Habilidad actualizada"), HttpStatus.OK);
    }
    
}

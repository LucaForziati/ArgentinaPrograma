/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.luca.Controler;

import com.portfolio.luca.Dto.dtoAcerca;
import com.portfolio.luca.Entity.Acerca;
import com.portfolio.luca.Security.Controller.Mensaje;
import com.portfolio.luca.Service.SAcerca;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acerca")
@CrossOrigin(origins = "https://frontendarp.web.app")
public class CAcerca {
    
    @Autowired
    SAcerca sAcerca;
    
    @GetMapping("lista")
    public ResponseEntity<List<Acerca>> list(){
        List<Acerca> list = sAcerca.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Acerca> getById(@PathVariable("id")int id) {
        if(!sAcerca.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        Acerca acerca = sAcerca.getOne(id).get();
        return new ResponseEntity(acerca, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sAcerca.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sAcerca.delete(id);
        return new ResponseEntity(new Mensaje("Acerca eliminada"), HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoAcerca dtoacerca){
        if(StringUtils.isBlank(dtoacerca.getAcerca())){
            return new ResponseEntity(new Mensaje("Acerca es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(sAcerca.existsByAcerca(dtoacerca.getAcerca())){
            return new ResponseEntity(new Mensaje("Acerca ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        Acerca acerca = new Acerca(
                dtoacerca.getAcerca(), dtoacerca.getNacimiento(), dtoacerca.getEmail() , dtoacerca.getLenguaje()
            );
        sAcerca.save(acerca);
        return new ResponseEntity(new Mensaje("acerca creada"), HttpStatus.OK);
                
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoAcerca dtoacerca){
        if(!sAcerca.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(sAcerca.existsByAcerca(dtoacerca.getAcerca()) && sAcerca.getByAcerca(dtoacerca.getAcerca()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoacerca.getAcerca())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }
        
        Acerca acerca = sAcerca.getOne(id).get();
        
        acerca.setAcerca(dtoacerca.getAcerca());
        acerca.setNacimiento(dtoacerca.getNacimiento());
        acerca.setEmail(dtoacerca.getEmail());
        acerca.setLenguaje(dtoacerca.getLenguaje());
        
        sAcerca.save(acerca);
        
        return new ResponseEntity(new Mensaje("Acerca actualizada"), HttpStatus.OK);
    }
    
    
}

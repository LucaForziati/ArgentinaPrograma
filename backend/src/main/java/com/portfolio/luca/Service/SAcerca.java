/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.luca.Service;

import com.portfolio.luca.Entity.Acerca;
import com.portfolio.luca.Repository.RAcerca;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAcerca {
    
    @Autowired
    RAcerca rAcerca;
    
    public List<Acerca> list() {
        return rAcerca.findAll();
    }
    
    public Optional<Acerca> getOne(int id){
        return rAcerca.findById(id);
    }
    public Optional<Acerca> getByAcerca(String acerca){
        return rAcerca.findByAcerca(acerca);
    }
    public void save(Acerca acerca){
        rAcerca.save(acerca);
    }
    public void delete(int id){
        rAcerca.deleteById(id);
    }
    public boolean existsById(int id) {
        return rAcerca.existsById(id);
    }
    public boolean existsByAcerca(String acerca){
        return rAcerca.existsByAcerca(acerca);
    }
    
}

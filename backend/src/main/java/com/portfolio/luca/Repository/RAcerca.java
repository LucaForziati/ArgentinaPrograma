/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.luca.Repository;

import com.portfolio.luca.Entity.Acerca;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAcerca extends JpaRepository<Acerca, Integer>{
    public Optional<Acerca> findByAcerca(String acerca);
    public boolean existsByAcerca(String acerca);
    
}

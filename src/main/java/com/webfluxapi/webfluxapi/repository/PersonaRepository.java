package com.webfluxapi.webfluxapi.repository;

import com.webfluxapi.webfluxapi.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Integer> {

}

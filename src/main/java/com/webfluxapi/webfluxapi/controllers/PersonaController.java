package com.webfluxapi.webfluxapi.controllers;

import com.webfluxapi.webfluxapi.models.Persona;
import com.webfluxapi.webfluxapi.service.PersonaInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    private PersonaInterfaceService service;

    @GetMapping("/listar")
    public Flux<Persona> listar(){
        return service.listar();
    }

    @PostMapping("/registrar")
    public Mono<Persona> registrar(@RequestBody Persona persona){
        return service.registrar(persona);
    }

    @PutMapping("/modificar")
    public Mono<Persona> modificar(@RequestBody Persona persona){
        return service.modificar(persona);
    }

    @GetMapping("/obtenerById/{id}")
    public Mono<Optional<Persona>> obtenerById(@PathVariable("id") Integer id){
        return service.obtenerById(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        service.eliminar(id);
    }
}



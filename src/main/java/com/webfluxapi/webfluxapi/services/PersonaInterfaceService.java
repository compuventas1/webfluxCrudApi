package com.webfluxapi.webfluxapi.service;

import com.webfluxapi.webfluxapi.models.Persona;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface PersonaInterfaceService {

    public Flux<Persona> listar();
    public Mono<Persona> registrar(Persona persona);
    public Mono<Persona> modificar(Persona persona);
    public Mono<Optional<Persona>> obtenerById(Integer id);
    public void eliminar(Integer id);
}



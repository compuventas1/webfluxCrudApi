package com.webfluxapi.webfluxapi.serviceImpl;

import com.webfluxapi.webfluxapi.models.Persona;
import com.webfluxapi.webfluxapi.repository.PersonaRepository;
import com.webfluxapi.webfluxapi.service.PersonaInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaInterfaceService {

    @Autowired
    private PersonaRepository repo;

    @Override
    public Flux<Persona> listar() {
        return Flux.fromIterable(repo.findAll());
    }

    @Override
    public Mono<Persona> registrar(Persona persona) {
        return Mono.just(repo.save(persona));
    }

    @Override
    public Mono<Persona> modificar(Persona persona) {
        return Mono.just(repo.save(persona));
    }

    @Override
    public Mono<Optional<Persona>> obtenerById(Integer id) {
        return Mono.just(repo.findById(id));
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}



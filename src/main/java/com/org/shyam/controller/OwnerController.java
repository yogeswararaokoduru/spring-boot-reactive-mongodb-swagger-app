package com.org.shyam.controller;

import com.org.shyam.model.Owner;
import com.org.shyam.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/Owner")
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @PostMapping(value = "/create")
    public Mono<Owner> addOwner(@RequestBody Owner owner) {
        return ownerRepository.save(owner);
    }

    @GetMapping(value = "/getalldetails")
    public Flux<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }
}

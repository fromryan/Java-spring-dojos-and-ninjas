package com.ryankim.dojoandninja.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ryankim.dojoandninja.models.Ninja;
import com.ryankim.dojoandninja.repositories.NinjaRepository;

@Service
public class NinjaService {

	private final NinjaRepository ninjaRepository;
    
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public Ninja createNinja(Ninja n) {
        return ninjaRepository.save(n);
    }

    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
}
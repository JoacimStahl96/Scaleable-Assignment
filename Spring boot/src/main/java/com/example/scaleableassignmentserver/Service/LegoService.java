package com.example.scaleableassignmentserver.Service;

import com.example.scaleableassignmentserver.Entity.LegoEntity;
import com.example.scaleableassignmentserver.Repository.LegoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LegoService {

    LegoRepository repository;

    public LegoService(LegoRepository repository) {
        this.repository = repository;
    }

    public Collection<LegoEntity> getAllLegos() {
        return repository.getWholeList();
    }

    public Collection<LegoEntity> getSpecificLego(String name) {
        if (!name.isEmpty()) {
            return repository.getSpecificLego(name);
        }
        return null;
    }
}
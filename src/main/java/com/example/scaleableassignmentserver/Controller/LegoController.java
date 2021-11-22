package com.example.scaleableassignmentserver.Controller;

import com.example.scaleableassignmentserver.Entity.LegoEntity;
import com.example.scaleableassignmentserver.Service.LegoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/")
public class LegoController {

    LegoService legoService;

    public LegoController(LegoService legoService) {
        this.legoService = legoService;
    }


    @GetMapping("all")
    public Collection<LegoEntity> getAllLegos() {
      //  legoService.loadFromFile();
        return legoService.getAllLegos();
    }

    @GetMapping("/{name}")
    public Collection<LegoEntity> getNamedLego(@PathVariable("name") String name){
      //  legoService.loadFromFile();
        if (name.isBlank()){
            return null;
        }
        return legoService.getSpecificLego(name);
    }
}

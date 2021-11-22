package com.example.scaleableassignmentserver.Repository;

import com.example.scaleableassignmentserver.Entity.LegoEntity;
import com.example.scaleableassignmentserver.Utils.GetLegosFromCSVFile;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class LegoRepository {

    private final List<LegoEntity> legoTypes= GetLegosFromCSVFile.getLegoList();

    public LegoRepository() {
    }

    public Collection<LegoEntity> getWholeList() {
        return legoTypes.stream().toList();
    }

    public Collection<LegoEntity> getSpecificLego(String name) {
        return legoTypes.stream().filter(n -> n.getName().equalsIgnoreCase(name)).toList();
    }

}

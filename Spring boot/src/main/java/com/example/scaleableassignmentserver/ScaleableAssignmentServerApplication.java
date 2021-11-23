package com.example.scaleableassignmentserver;

import com.example.scaleableassignmentserver.Utils.GetLegosFromCSVFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScaleableAssignmentServerApplication {

    public static void main(String[] args) {
        GetLegosFromCSVFile.loadFromFile();
        SpringApplication.run(ScaleableAssignmentServerApplication.class, args);
    }

}

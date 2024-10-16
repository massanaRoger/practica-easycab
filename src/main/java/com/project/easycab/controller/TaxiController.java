package com.project.easycab.controller;

import com.project.easycab.service.MapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxiController {
    private final MapService mapService;

    public TaxiController(MapService mapService) {
        this.mapService = mapService;
    }

    @GetMapping("/map")
    public String showMap() {
        return mapService.renderMap();
    }
}

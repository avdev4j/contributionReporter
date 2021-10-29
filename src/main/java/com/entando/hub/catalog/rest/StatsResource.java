package com.entando.hub.catalog.rest;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/stats")
public class StatsResource {
    @CrossOrigin
    @GetMapping("/sales")
    public Stats getSales() {
        Map<String, Integer> data = new LinkedHashMap<>();
        data.put("January", 89000);
        data.put("February", 53000);
        data.put("March", 17000);
        data.put("April", 105000);
        data.put("May", 28000);
        data.put("June", 84000);
        data.put("July", 114000);
        data.put("August", 3000);
        data.put("September", 67000);
        data.put("October", 118000);
        data.put("November", 10000);
        data.put("December", 29000);

        return new Stats("Sales", data);
    }

    @Data
    public static class Stats{
        private final String name;
        private final Map<String, Integer> data;

        public Stats(String name, Map<String, Integer> data) {
            this.name = name;
            this.data = data;
        }
    }

}

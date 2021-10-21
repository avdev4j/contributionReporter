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
    @GetMapping("/commits")
    public Stats getCommits() {
        Map<String, Integer> data = new LinkedHashMap<>();
        data.put("January", 89);
        data.put("February", 53);
        data.put("March", 17);
        data.put("April", 105);
        data.put("May", 28);
        data.put("June", 84);
        data.put("July", 114);
        data.put("August", 3);
        data.put("September", 67);
        data.put("October", 118);
        data.put("November", 10);
        data.put("December", 29);

        return new Stats("Commits", data);
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

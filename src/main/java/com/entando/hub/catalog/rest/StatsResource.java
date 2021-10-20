package com.entando.hub.catalog.rest;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/stats")
public class StatsResource {
    @CrossOrigin
    @GetMapping("/commits")
    public Stats getCommits() {
        Map data = new HashMap();
        data.put("January", 89);
        data.put("February", 53);

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

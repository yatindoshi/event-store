package com.hsbc.fxpteventstore.controller;

import com.hsbc.fxpteventstore.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/events/{id}")
    public String getEventById(@PathVariable String id) {
        return eventService.getById(id);
    }
}

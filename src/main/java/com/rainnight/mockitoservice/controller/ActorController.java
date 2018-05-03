package com.rainnight.mockitoservice.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rainnight.mockitoservice.model.Actor;
import com.rainnight.mockitoservice.service.ActorService;
import com.rainnight.mockitoservice.service.impl.ActorServiceImpl;


@RestController
public class ActorController {

	@Autowired private ActorService actorService;

	@GetMapping("/actor/get-all")
	@ResponseBody
    public List<Actor> getAllActors() {
            return actorService.getAll();
    }
	
	@GetMapping("/test")
	@ResponseBody
    public String getTestResponse() {
            return "Hello world! from Actor Controller";
    }
    
	/*
    @PostMapping("/add")
    public ResponseEntity<Void> registerStudentForCourse(@RequestBody Actor newActor) {

    List<Actor> actors= actorService.addActor(newActor);

    if (actors == null)
            return ResponseEntity.noContent().build();

    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                    "/{id}").buildAndExpand(actors).toUri();

    return ResponseEntity.created(location).build();
	}
	*/
}

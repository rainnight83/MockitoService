package com.rainnight.mockitoservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.rainnight.mockitoservice.model.Actor;
import com.rainnight.mockitoservice.service.ActorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ActorServiceImpl implements ActorService{

	private static List<Actor> actors = new ArrayList<>();
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	static {
        //Initialize Data
		Actor actor = new Actor("1","Lufy","Pirate Leader", "Lufy@localhost");
		actors.add(actor);
	}
	
	@Override
	public List<Actor> getAll() {
		// TODO Auto-generated method stub
		log.info("getAll : " + actors.size());
		return actors;
	}

	@Override
	public List<Actor> addActor(Actor actor) {
		// TODO Auto-generated method stub
		log.info("Actor added : " + actor.getName());
		actors.add(actor);
		return actors;
	}

}

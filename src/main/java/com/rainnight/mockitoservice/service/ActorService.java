package com.rainnight.mockitoservice.service;

import java.util.List;

import com.rainnight.mockitoservice.model.Actor;

public interface ActorService {

	public List<Actor> getAll();
	public List<Actor> addActor(Actor actor);
}

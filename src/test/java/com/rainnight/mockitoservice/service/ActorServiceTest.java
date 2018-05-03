package com.rainnight.mockitoservice.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.rainnight.mockitoservice.model.Actor;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:com/rainnight/mockitoservice/ActorService-context.xml")
public class ActorServiceTest {
	 /*Autowired with Mock defined in Context Bean */
	
	@Autowired ActorService actorService;
	
	@Test
	public void testAddActor()
	{
		Actor actor = new Actor();
		actor.setActive(true);
		actor.setId("1");
		actor.setName("Lufy");
		actor.setEmail("lufy@localhost");
		List<Actor> actors = new ArrayList<Actor>();
		actors.add(actor);
		
		Mockito.when(actorService.addActor(actor)).thenReturn(actors);
		
		List<Actor> result = actorService.addActor(actor);
		
		System.out.println("Total actor count : " + result.size());
	}
	
	@Test
	public void testAllActors()
	{
		Actor actor = new Actor();
		actor.setActive(true);
		actor.setId("1");
		actor.setName("Lufy");
		actor.setEmail("lufy@localhost");
		
		Actor actor2 = new Actor();
		actor2.setActive(true);
		actor2.setId("1");
		actor2.setName("Zoro");
		actor2.setEmail("Zoro@localhost");
		
		List<Actor> actors = new ArrayList<Actor>();
		actors.add(actor);
		actors.add(actor2);
		
		Mockito.when(actorService.getAll()).thenReturn(actors);
		
		List<Actor> result = actorService.getAll();

		System.out.println("Total actor count : " + result.size());
	}
}

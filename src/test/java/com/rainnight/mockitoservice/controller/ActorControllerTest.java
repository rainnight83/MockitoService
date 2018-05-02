package com.rainnight.mockitoservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.rainnight.mockitoservice.controller.ActorController;
import com.rainnight.mockitoservice.model.Actor;
import com.rainnight.mockitoservice.service.ActorService;


@RunWith(SpringRunner.class)
//@ContextConfiguration(locations = "classpath:com/rainnight/mockitoservice/ActorService-context.xml")
@WebMvcTest(value = ActorController.class, secure = false)
public class ActorControllerTest {
	
	@Autowired private MockMvc mockMvc;
	@MockBean private ActorService actorService;
	//@Autowired private ActorService actorService;
	
	@Test
	public void testRestGetAllActors() throws Exception
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
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/actor/get-all").accept(
                MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		System.out.println("Actors Response Result : " + result.getResponse().getContentAsString());
		
	}
	
	@Test
	public void testRestGetTestResponse() throws Exception
	{
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/test").accept(
                MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		System.out.println("Test Response Result : " + result.getResponse().getContentAsString());
		
	}

}

package com.joy.lottery.resource;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.joy.lottery.model.Test;
import com.joy.lottery.service.TestService;

/**
 * Created by lujia on 14-10-30
 */
@Path("/gome")
@Controller
@Scope("prototype")
public class FormatTest {

	@Autowired
	private TestService testService;

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Test get(@PathParam("id") String id) {
		System.out.println(id);
		System.out.println(testService.test());
		Test test = new Test();
		test.setName("string");
		test.setId(0);
		List<String> list = Lists.newArrayList();
		list.add("shenyang");
		list.add("beijing");
		test.setAddress(list);
		Map<String, String> map = Maps.newHashMap();
		map.put("alipay", "adsfaf");
		map.put("iqiyi", "asdfasf");
		test.setAccount(map);
		return test;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void postt(Test test) {
		// String param = request.getParameter("args");

		System.out.println(test.getId());
		System.out.println(test.getName());
		for (String str : test.getAddress()) {
			System.out.println(str);
		}
		for (String key : test.getAccount().keySet()) {
			System.out.println(key + " : " + test.getAccount().get(key));
		}
	}

	@POST
	@Path("/test")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public String postClichedMessage(String message) {
		System.out.println(message);
		return "1";
	}

	@POST
	@Path("/report")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void post(@FormParam("args") String args) {
		System.out.println(args);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void put(Test test) {
		System.out.println(test.getId());
		System.out.println(test.getName());
		System.out.println(test.getAddress());
		System.out.println(test.getAccount());
	}

	@DELETE
	@Path("{id}")
	public void delete(@PathParam("id") String id) {
		System.out.println(id);
	}

}

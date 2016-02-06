package ru.ast.server.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Fenix
 */

@Controller
public class WelcomeController {

	@RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
	public String welcomePage() {
		return "welcome";
	}
}

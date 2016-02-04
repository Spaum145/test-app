package ru.ast.server.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.ast.server.domain.entity.Question;

/**
 * @author Fenix
 */

@Controller
@RequestMapping(value = "/q")
public class QuestionController {

	@RequestMapping(value = "/get")
	@ResponseBody
	public Question getQuestion() {
		Question q1 = new Question();
		q1.setQuestionId(1L);
		q1.setContent("Content");
		return q1;
	}
}

package ru.ast.server.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ast.server.controller.UrlConstants;
import ru.ast.server.domain.entity.Question;
import ru.ast.server.service.api.IQuestionService;

/**
 * @author Fenix
 */

@RestController
@RequestMapping(value = UrlConstants.QUESTION_URL)
public class QuestionController {

	@Autowired
	private IQuestionService questionService;

	@RequestMapping(value = UrlConstants.TEST_GET_URL)
	public Question test() {
		return questionService.testGet();
	}
}

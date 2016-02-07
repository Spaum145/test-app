package ru.ast.server.service.impl;

import org.springframework.stereotype.Service;
import ru.ast.server.domain.entity.Question;
import ru.ast.server.service.api.IQuestionService;

/**
 * @author Fenix
 */
@Service
public class QuestionServiceImpl implements IQuestionService {

	@Override
	public Question testGet() {
		Question q1 = new Question();
		q1.setQuestionId(1L);
		q1.setContent("Content");
		return q1;
	}
}

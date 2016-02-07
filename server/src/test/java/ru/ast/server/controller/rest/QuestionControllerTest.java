package ru.ast.server.controller.rest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import ru.ast.server.config.TestConfig;
import ru.ast.server.config.WebConfig;
import ru.ast.server.controller.UrlConstants;
import ru.ast.server.domain.entity.Question;
import ru.ast.server.service.api.IQuestionService;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Fenix
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class, WebConfig.class})
@WebAppConfiguration
public class QuestionControllerTest {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Autowired
	private IQuestionService questionService;

	@Before
	public void setup() {
		reset(questionService);
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void test() throws Exception {
		Question dummyQuestion = new Question();
		dummyQuestion.setQuestionId(1L);
		dummyQuestion.setContent("Content");
		when(questionService.testGet()).thenReturn(dummyQuestion);

		mockMvc.perform(get(UrlConstants.QUESTION_URL + UrlConstants.TEST_GET_URL))
				.andExpect(status().isOk())
				.andExpect(jsonPath("questionId").exists())
				.andExpect(jsonPath("content").exists())
				.andExpect(jsonPath("questionId").value(1))
				.andExpect(jsonPath("content").value("Content"))
		.andDo(print());

		verify(questionService, times(1)).testGet();
	}

}

package ru.ast.server.config;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.ast.server.service.api.IQuestionService;

/**
 * Configures test context
 *
 * @author Fenix
 */


@Configuration
public class TestConfig {

	@Bean
	public IQuestionService questionService() {
		return Mockito.mock(IQuestionService.class);
	}
}
